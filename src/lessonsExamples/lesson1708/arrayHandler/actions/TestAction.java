package lessonsExamples.lesson1708.arrayHandler.actions;

import lessonsExamples.lesson1708.arrayHandler.Action;

public class TestAction implements Action {
    @Override
    public String doAction(String stringToReverse) {
        if (stringToReverse == null){
            return null;
        }
        return "test";
    }
}
