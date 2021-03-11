package lessonsExamples.hw1310;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class StringTransform {
    ////"abc defG ikl" -> "ABC defG IKL"
    //    // length == 3 -> toUpperCase
    //   // length == 5 -> toLowerCase
    //   // length is even -> to UpperCase

    static String transform(String sentence, Predicate<Integer> predicate, UnaryOperator<String> function) {
        String[] stringByWords = sentence.split(" ");
        for (int i = 0; i < stringByWords.length; i++) {
            if (predicate.test(stringByWords[i].length())) {
                stringByWords[i] = function.apply(stringByWords[i]);
            }
        }
        return String.join(" ", stringByWords);
    }

    public static String transform1(String sentence) {
        return transform(sentence, s -> s == 3, String::toUpperCase);
    }

    public static String transform2(String sentence) {
        return transform(sentence, s -> s == 5, String::toLowerCase);
    }

    public static String transform3(String sentence) {
        return transform(sentence, s -> s % 2 == 0, String::toUpperCase);
    }

    public static String transform4(String sentence, int length) {
        return transform(sentence, s -> s == length, String::toUpperCase);
    }
}
