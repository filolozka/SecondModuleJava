package lessonsExamples.lesson1708;

import java.util.Arrays;

public class StringArrayHandler {
    private String[] strings;

    public StringArrayHandler(String[] strings) {
        this.strings = strings;
    }

    public String[] getStrings() {
        return strings;
    }

    @Override
    public String toString() {
        return Arrays.toString(strings);
    }

    public void stringsHadle(Action action, Condition condition){
        for (int i = 0; i < strings.length; i++) {
            if (condition.test(strings[i])){
                strings[i] = action.doAction(strings[i]);
            }
        }
    }
}
