package lessonsExamples.lesson1708.arrayHandler;

public class ActionAndConditionExample implements Condition, Action {

    @Override
    public String doAction(String stringToReverse) {
        if (stringToReverse == null){
            return null;
        }
        return stringToReverse + "!";
    }

    @Override
    public boolean test(String str) {
        return str != null;
    }
}
