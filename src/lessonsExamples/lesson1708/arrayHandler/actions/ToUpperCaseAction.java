package lessonsExamples.lesson1708.arrayHandler.actions;

import lessonsExamples.lesson1708.arrayHandler.Action;

public class ToUpperCaseAction implements Action {

    @Override
    public String doAction(String stringToReverse) {
        if (stringToReverse != null) {
            return stringToReverse.toUpperCase();
        } else {
            return null;
        }
    }
}
