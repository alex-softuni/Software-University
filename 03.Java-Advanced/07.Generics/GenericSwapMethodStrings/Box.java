package GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<E> {
    List<E> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void add(E element) {
        this.box.add(element);
    }

    public void swap(int index1, int index2) {
        E temp = box.get(index1);
        box.set(index1, box.get(index2));
        box.set(index2, temp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (E e : box) {
            sb
                    .append(e.getClass().getName()).append(": ").append(e)
                    .append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
