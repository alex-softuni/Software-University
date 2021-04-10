package aquarium.core;

import aquarium.entities.aquariums.Aquarium;
import aquarium.entities.aquariums.BaseAquarium;
import aquarium.entities.aquariums.FreshwaterAquarium;
import aquarium.entities.aquariums.SaltwaterAquarium;
import aquarium.entities.decorations.Decoration;
import aquarium.entities.decorations.Ornament;
import aquarium.entities.decorations.Plant;
import aquarium.entities.fish.Fish;
import aquarium.entities.fish.FreshwaterFish;
import aquarium.entities.fish.SaltwaterFish;
import aquarium.repositories.DecorationRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class ControllerImpl implements Controller {
    private DecorationRepository decorations;
    private Map<String, BaseAquarium> aquariums;
    private String aquariumType;

    public ControllerImpl() {
        this.aquariums = new LinkedHashMap<>();
        this.decorations = new DecorationRepository();
    }

    @Override
    public String addAquarium(String aquariumType, String aquariumName) {
        this.aquariumType = aquariumType;
        String msg;
        switch (aquariumType) {
            case "FreshwaterAquarium":
                BaseAquarium aquarium = new FreshwaterAquarium(aquariumName);
                aquariums.put(aquariumName, aquarium);
                msg = String.format("Successfully added %s.", aquariumType);
                break;
            case "SaltwaterAquarium":
                BaseAquarium aquarium1 = new SaltwaterAquarium(aquariumName);
                aquariums.put(aquariumName, aquarium1);
                msg = String.format("Successfully added %s.", aquariumType);
                break;
            default:
                throw new NullPointerException("Invalid aquarium type.");
        }

        return msg;
    }

    @Override
    public String addDecoration(String type) {
        Decoration decoration;
        switch (type) {
            case "Ornament":
                decoration = new Ornament();
                break;
            case "Plant":
                decoration = new Plant();
                break;
            default:
                throw new IllegalArgumentException("Invalid decoration type.");
        }
        this.decorations.add(decoration);
        return String.format("Successfully added %s.", type);
    }

    @Override
    public String insertDecoration(String aquariumName, String decorationType) {
        Decoration decoration = this.decorations.findByType(decorationType);
        if (decoration == null) {
            throw new IllegalArgumentException(String.format("There isn't a decoration of type %s.", decorationType));
        }
        this.decorations.remove(decoration);
        this.aquariums.get(aquariumName).addDecoration(decoration);
        return String.format("Successfully added %s to %s.", decorationType, aquariumName);
    }

    @Override
    public String addFish(String aquariumName, String fishType, String fishName, String fishSpecies, double price) {
        Fish fish = null;
        // Initializing fish
        if (fishType.equals("FreshwaterFish")) {
            fish = new FreshwaterFish(fishName, fishSpecies, price);
        } else if (fishType.equals("SaltwaterFish")) {
            fish = new SaltwaterFish(fishName, fishSpecies, price);
        } else {
            throw new IllegalArgumentException("Invalid fish type.");
        }

        String msg;
        int aquariumCapacity = this.aquariums.get(aquariumName).getCapacity();
        int fishAlreadyInside = this.aquariums.get(aquariumName).getFish().size();

        String fishAquariumType = fishType.replace("Fish", "");
        String aquariumType1 = this.aquariumType.replace("Aquarium", "");


        // adding fish if aquarium capacity allows it and water is suitable for the fish
        if (aquariumCapacity > fishAlreadyInside && fishAquariumType.equals(aquariumType1)) {
            this.aquariums.get(aquariumName).addFish(fish);
            msg = String.format("Successfully added %s to %s.", fishType, aquariumName);
        } else if (!fishAquariumType.equals(this.aquariumType)) {
            msg = "Water not suitable.";
        } else {
            msg = "Not enough capacity.";
        }
        return msg;
    }

    @Override
    public String feedFish(String aquariumName) {
        this.aquariums.get(aquariumName).feed();
        return String.format("Fish fed: %d", this.aquariums.get(aquariumName).getFish().size());
    }

    @Override
    public String calculateValue(String aquariumName) {
        double sum = 0;
        for (Fish fish : this.aquariums.get(aquariumName).getFish()) {
            sum += fish.getPrice();
        }
        for (Decoration decoration : this.aquariums.get(aquariumName).getDecorations()) {
            sum += decoration.getPrice();
        }


        return String.format("The value of Aquarium %s is %.2f.", aquariumName, sum);
    }

    @Override
    public String report() {
        StringBuilder sb = new StringBuilder();
        for (BaseAquarium aquarium : this.aquariums.values()) {
            sb.append(aquarium.getInfo());
            sb.append(System.lineSeparator());

        }
        return sb.toString().trim();
    }
}
