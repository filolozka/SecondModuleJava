package lessonsExamples.lesson1708;

public class ToUpperCaseAction implements Action {

    @Override
    public String doAction(String stringToReverse) {
        return stringToReverse.toUpperCase();
    }
}
