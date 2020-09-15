package lessonsExamples.lesson1708.arrayHandler.conditions;

import lessonsExamples.lesson1708.arrayHandler.Condition;

public class TestCondition implements Condition {
    @Override
    public boolean test(String str) {
        return str != null && str.length() > 2;
    }
}
