package aquarium.entities.aquariums;

import aquarium.entities.decorations.Decoration;
import aquarium.entities.fish.BaseFish;
import aquarium.entities.fish.Fish;

import java.util.*;
import java.util.stream.Collectors;

public abstract class BaseAquarium implements Aquarium {
    private String name;
    private int capacity;
    private List<Decoration> decorations;
    private List<Fish> fish;


    protected BaseAquarium(String name, int capacity) {
        this.setName(name);
        this.setCapacity(capacity);
        this.decorations = new ArrayList<>();
        this.fish = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException("Aquarium name cannot be null or empty.");
        }
        this.name = name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int calculateComfort() {
        return decorations
                .stream()
                .mapToInt(e -> Integer.parseInt(String.valueOf(e.getComfort())))
                .sum();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addFish(Fish fish) {
        if (capacity < this.fish.size()) {
            throw new IllegalStateException("Not enough capacity.");
        }
        this.fish.add(fish);
    }

    @Override
    public void removeFish(Fish fish) {
        this.fish.remove(fish);
    }

    @Override
    public void addDecoration(Decoration decoration) {
        this.decorations.add(decoration);
    }

    @Override
    public void feed() {
        for (Fish fish : this.fish) {
            fish.eat();
        }
    }

//"{aquariumName} ({aquariumType}):
//Fish: {fishName1} {fishName2} {fishName3} (…) / none
//Decorations: {decorationsCount}
//Comfort: {aquariumComfort}"
    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s (%s):%n", this.name,this.getClass().getSimpleName()));

        String collect;
        sb.append("Fish: ");
        if (!fish.isEmpty()) {
            collect = fish
                    .stream()
                    .map(Fish::getName)
                    .collect(Collectors.joining(" "));
        } else {
            collect = "none";
        }
        sb.append(collect);
        sb.append(System.lineSeparator());
        sb.append(String.format("Decorations: %d%n", decorations.size()));
        sb.append(String.format("Comfort: %d", calculateComfort()));

        return sb.toString();
    }

    @Override
    public Collection<Fish> getFish() {
        return this.fish;
    }

    @Override
    public Collection<Decoration> getDecorations() {
        return this.decorations;
    }
}
