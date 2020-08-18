package lessonsExamples.lesson1708;

public class ReverseCondition implements Condition {

    @Override
    public boolean test(String str) {
        int maxLength = 4;
        return (str.length() - 1) > maxLength;
    }
}
