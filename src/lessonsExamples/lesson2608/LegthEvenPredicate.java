package lessonsExamples.lesson2608;

import java.util.function.Predicate;

public class LegthEvenPredicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        if (s == null || s == "") return false;
        return s.length() % 2 == 0;
    }
}
