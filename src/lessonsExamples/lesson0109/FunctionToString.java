package lessonsExamples.lesson0109;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionToString implements BiFunction<List<String>, Predicate<String>, List<String>> {
    //private Predicate predicate;

   /* public FunctionToString(Predicate predicate) {
        this.predicate = predicate;
    }

    @Override
    public List<String> apply(List<String> strings) {
        List<String> newList = new ArrayList<>();
        if (strings == null) return newList;
        for (String line: strings) {
            if (predicate.test(line)) {
                newList.add(line);
            }
        }
        return newList;
    }*/

    @Override
    public List<String> apply(List<String> strings, Predicate<String> predicate) {
        List<String> newList = new ArrayList<>();
        if (strings == null) return newList;
        for (String line: strings) {
            if (predicate.test(line)) {
                newList.add(line);
            }
        }
        return newList;
    }
}
