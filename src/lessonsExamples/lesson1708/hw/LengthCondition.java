package lessonsExamples.lesson1708.hw;

public class LengthCondition implements Condition {
    @Override
    public boolean checkCondition(String string, int length) {
        return string != null && string.length() < length;
    }
}
