package lessonsExamples.lesson2508;

import java.util.function.Predicate;

public class ConditionForRemove implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.startsWith("q");
    }
}
