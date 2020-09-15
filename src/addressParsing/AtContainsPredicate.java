package addressParsing;

import java.util.function.Predicate;

public class AtContainsPredicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.contains("@");
    }
}
