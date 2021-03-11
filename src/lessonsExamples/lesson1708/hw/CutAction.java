package lessonsExamples.lesson1708.hw;

public class CutAction implements Action {
    @Override
    public String doAction(String string, int length) {
        if (string != null && string.length() > 0) {
            return string.substring(0, (length));
        } else {
            return null;

        }
    }
}
