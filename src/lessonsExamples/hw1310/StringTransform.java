package lessonsExamples.hw1310;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class StringTransform {
    ////"abc defG ikl" -> "ABC defG IKL"
    //    // length == 3 -> toUpperCase
    //   // length == 5 -> toLowerCase
    //   // length is even -> to UpperCase

    public static void main(String[] args) {
        String testString = "abc defG ikl";
        System.out.println(transform(testString, 4));
    }

    public static String transform(String sentence, Predicate<Integer> predicate, UnaryOperator<String> function) {
        StringBuilder result = new StringBuilder();
        String[] stringByWords = sentence.split(" ");
        for (String stringByWord : stringByWords) {
            if (predicate.test(stringByWord.length())) {
                result = new StringBuilder(result.toString().concat(" ").concat(function.apply(stringByWord)));
            } else {
                result.append(" ").append(stringByWord);
            }
        }
        return result.toString();
    }

    public static String transform(String sentence, int length) {
        Predicate<Integer> predicateToTransform = s -> s == length;
        UnaryOperator<String> transform = String::toUpperCase;
        return transform(sentence, predicateToTransform, transform);
    }
}
