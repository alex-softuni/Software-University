package PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemonList;

    public void subtractFromHealth(int number) {
        for (Pokemon pokemon : pokemonList) {
            pokemon.setHealth(pokemon.getHealth() - 10);
        }
    }

    public void removeDeadPokemon() {
        pokemonList.removeIf(pokemon -> pokemon.getHealth() <= 0);
    }

    public void initializeList() {
        this.pokemonList = new ArrayList<>();
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public Trainer(String name, int numberOfBadges) {
        this.name = name;
        this.numberOfBadges = numberOfBadges;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name);
        sb.append(" ")
                .append(this.numberOfBadges)
                .append(" ")
                .append(this.pokemonList.size())
                .append(System.lineSeparator());
        return sb.toString().trim();
    }
}
