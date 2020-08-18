package lessonsExamples.lesson1708;

public class ReverseCondition implements Condition {

    @Override
    public boolean test(String str) {
        return str != null && str.length() > 4; //обязательно первой давать проверку на null
    }

    public boolean test2(String str){
        int maxLength = 4;
        return (str.length() - 1) > maxLength;
    }
}
