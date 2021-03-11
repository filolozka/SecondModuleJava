package lessonsExamples.lesson2608;

import java.util.function.Predicate;

public class Condition implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return false;
    }
}
