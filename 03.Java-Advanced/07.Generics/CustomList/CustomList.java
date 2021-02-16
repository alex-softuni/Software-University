package CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<E extends Comparable<E>> {
    private List<E> customList;
    //•	Max - Prints the maximum element in the list
    //•	Min - Prints the minimum element in the list
    //•	Print - Prints all elements in the list, each on a separate line

    public CustomList() {
        this.customList = new ArrayList<>();
    }

    public void add(E element) {
        this.customList.add(element);
    }

    public E remove(int index) {
        return this.customList.remove(index);
    }

    public boolean contains(E element) {
        return this.customList.contains(element);
    }

    public void swap(int index1, int index2) {
        Collections.swap(this.customList, index1, index2);
    }

    public long countGreaterThan(E element) {
        return this.customList
                .stream()
                .filter(e -> e.compareTo(element) > 0)
                .count();
    }

    public E getMax() {
        return Collections.max(this.customList);
    }

    public E getMin() {
        return Collections.min(this.customList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (E e : this.customList) {
            sb
                    .append(e.toString())
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
