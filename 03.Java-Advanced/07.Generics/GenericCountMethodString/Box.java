package GenericCountMethodString;

import java.util.ArrayList;
import java.util.List;

public class Box<E extends Comparable> {
    private List<E> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void add(E element) {
        this.box.add(element);
    }

    public long countGreaterElements(E element) {
        return this.box.stream()
                .filter(e -> e.compareTo(element) > 0)
                .count();
    }
}
