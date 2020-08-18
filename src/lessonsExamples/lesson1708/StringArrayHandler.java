package lessonsExamples.lesson1708;

import java.util.Arrays;

public class StringArrayHandler {
    private String[] strings;
    private Action action;
    private Condition condition;

    public StringArrayHandler(String[] strings, Action action, Condition condition) {
        this.action = action;
        this.condition = condition;
        this.strings = strings;
    }

    public String[] getStrings() {
        return strings;
    }

    @Override
    public String toString() {
        return Arrays.toString(strings);
    }

    public StringArrayHandler stringsHadler(){ //сделав так, можно потом вызывать метод цепочкой
        for (int i = 0; i < strings.length; i++) {
            if (condition.test(strings[i])){
                strings[i] = action.doAction(strings[i]);
            }
        }
        return this;
    }
}
