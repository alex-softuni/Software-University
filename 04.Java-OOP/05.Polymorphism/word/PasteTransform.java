package word;

import java.util.Deque;

public class PasteTransform implements TextTransform {
    private Deque<StringBuilder> deque;

    public PasteTransform(Deque<StringBuilder> deque) {
        this.deque = deque;
    }

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            text.insert(startIndex ,deque.peek());
        } else {
            text.replace(startIndex, endIndex, String.valueOf(deque.peek()));
        }
    }
}
