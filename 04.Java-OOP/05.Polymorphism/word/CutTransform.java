package word;

import java.util.Deque;

public class CutTransform implements TextTransform {
    private Deque<StringBuilder> deque;

    public CutTransform(Deque<StringBuilder> text) {
        this.deque = text;
    }

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            deque.clear();
        }
        StringBuilder cutText = new StringBuilder(text.substring(startIndex, endIndex));
        text.replace(startIndex, endIndex, "");
        deque.push(cutText);
    }
}
