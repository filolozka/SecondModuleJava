package lessonsExamples.lesson1708;

public class LengthCondition implements Condition{
    private int lenght;

    public LengthCondition(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean test(String str) {
        return str != null && str.length() > lenght;
    }
}
