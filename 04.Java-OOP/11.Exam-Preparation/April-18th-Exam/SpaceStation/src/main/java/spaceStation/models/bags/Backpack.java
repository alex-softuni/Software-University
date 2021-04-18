package spaceStation.models.bags;

import java.util.Collection;
import java.util.LinkedList;

public class Backpack implements Bag {
    Collection<String> items;

    public Backpack() {
        this.items = new LinkedList<>();
    }

    @Override
    public Collection<String> getItems() {
        return this.items;
    }
}
