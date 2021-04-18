package spaceStation.core;

import spaceStation.models.astronauts.Astronaut;
import spaceStation.models.astronauts.Biologist;
import spaceStation.models.astronauts.Geodesist;
import spaceStation.models.astronauts.Meteorologist;
import spaceStation.models.bags.Bag;
import spaceStation.models.mission.Mission;
import spaceStation.models.mission.MissionImpl;
import spaceStation.models.planets.Planet;
import spaceStation.models.planets.PlanetImpl;
import spaceStation.repositories.AstronautRepository;
import spaceStation.repositories.PlanetRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static spaceStation.common.ConstantMessages.*;
import static spaceStation.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {
    private AstronautRepository astronautRepository;
    private PlanetRepository planetRepository;

    public ControllerImpl() {
        this.astronautRepository = new AstronautRepository();
        this.planetRepository = new PlanetRepository();
    }

    @Override
    public String addAstronaut(String type, String astronautName) {
        Astronaut astronaut;
        switch (type) {
            case "Biologist":
                astronaut = new Biologist(astronautName);
                break;
            case "Geodesist":
                astronaut = new Geodesist(astronautName);
                break;
            case "Meteorologist":
                astronaut = new Meteorologist(astronautName);
                break;
            default:
                throw new IllegalArgumentException(String.format(ASTRONAUT_INVALID_TYPE));
        }
        this.astronautRepository.add(astronaut);
        return String.format(ASTRONAUT_ADDED, type, astronautName);
    }

    @Override
    public String addPlanet(String planetName, String... items) {
        Planet planet = new PlanetImpl(planetName);
        planetRepository.add(planet);
        for (String item : items) {
            if (item != null || !item.trim().isEmpty()) {
                planet.getItems().add(item);
            }
        }


        return String.format("Successfully added Planet: %s!", planetName);
    }


    @Override
    public String retireAstronaut(String astronautName) {
        String out = String.format("Astronaut %s doesn't exists!", astronautName);
        boolean remove = astronautRepository.remove(astronautRepository.findByName(astronautName));
        if (remove) {
            out = String.format("Astronaut %s was retired!", astronautName);
        }
        return out;
    }

    private static int PLANETS_EXPLORED = 0;


    @Override
    public String explorePlanet(String planetName) {
        String out;

        Mission mission = new MissionImpl();
        Planet planet = planetRepository.findByName(planetName);
        Collection<Astronaut> suitableAstronautsForMission = new ArrayList<>();

        for (Astronaut as : astronautRepository.getModels()) {
            if (as.getOxygen() >= 60) {
                suitableAstronautsForMission.add(as);
            }
        }
        if (suitableAstronautsForMission.isEmpty()) {
            throw new IllegalArgumentException("You need at least one astronaut to explore the planet!");
        }

        mission.explore(planet, suitableAstronautsForMission);


        int totalCount = 0;
        for (Astronaut model : astronautRepository.getModels()) {
            if (model.getOxygen() <= 0) {
                totalCount++;
            }

        }
        PLANETS_EXPLORED++;

        out = String.format("Planet: %s was explored! Exploration finished with %d dead astronauts!"
                , planetName, totalCount);
        return out;
    }
//"{exploredPlanetsCount} planets were explored!"
//"Astronauts info:"
//"Name: {astronautName One}"
//"Oxygen: {astronautOxygen One}"
    //"Bag items: {bagItem1, bagItem2, bagItem3, …, bagItemn \ "none"}"

    @Override
    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d planets were explored!%n", PLANETS_EXPLORED));
        sb.append("Astronauts info:");
        sb.append(System.lineSeparator());
        for (Astronaut model : astronautRepository.getModels()) {
            sb.append(String.format("Name: %s%n", model.getName()));
            sb.append(String.format("Oxygen: %.0f%n", model.getOxygen()));
            sb.append(String.format("Bag items: "));
            if (model.getBag().getItems().isEmpty()) {
                sb.append("none");
                sb.append(System.lineSeparator());
            } else {
                String finalResult = model.getBag().getItems().stream().collect(Collectors.joining(", "));
                sb.append(finalResult);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }
}


