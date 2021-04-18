package spaceStation.models.mission;

import spaceStation.models.astronauts.Astronaut;
import spaceStation.models.planets.Planet;

import java.util.Collection;
import java.util.Iterator;

public class MissionImpl implements Mission {

    @Override
    public void explore(Planet planet, Collection<Astronaut> astronauts) {
        for (Astronaut astronaut : astronauts) {
            while (astronaut.canBreath()) {
                if (!planet.getItems().isEmpty()) {
                    Collection<String> items = planet.getItems();

                    for (Iterator<String> iterator = items.iterator(); iterator.hasNext(); ) {
                        if (astronaut.getOxygen() == 0) {
                            break;
                        }
                        String value = iterator.next();
                        astronaut.getBag().getItems().add(value);
                        astronaut.breath();
                        iterator.remove();

                    }
                    if (items.size() != 0) {

                        for (String item : items) {
                            if (item == null || item.trim().isEmpty() || items.size() == 0) {
                                break;
                            }

                        }
                    }
                }

                if (!astronaut.canBreath() || planet.getItems().size() == 0) {
                    break;
                }
            }
        }
    }
}
