package lessonsExamples.hw08102020;

import java.time.LocalDate;
import java.util.function.*;

public class LambdaTasks {
    public static void main(String[] args) {

        System.out.println("1-----");
        Function<Integer, Integer> powerInt = s -> s * s;
        System.out.println("Try function powerInt with s = " + 5 + " : " + powerInt.apply(5));

        System.out.println("2-----");
        Function<String, Integer> moduloOfLength = s -> s.length() % 2;
        System.out.println("Try function moduloOfLength with s = " + "abcdc: " + moduloOfLength.apply("abcdc"));

        System.out.println("3-----");
        Function<String, String> upperCase = s -> s.toUpperCase();
        System.out.println("Try function upperCase with s = " + "abcd: " + upperCase.apply("abcd"));

        System.out.println("4-----");
        BiFunction<String, String, Integer> stringSums = (s1, s2) -> s1.length() + s2.length();
        String string1 = "abcd";
        String string2 = "edf";
        System.out.println("Try function stringSums with string1 = " + string1 + ", string2 = " + string2 + ": "
                + stringSums.apply(string1, string2));

        System.out.println("5-----");
        MyFunction printStringSums = (s1, s2) -> System.out.println(s1.length() + s2.length());
        System.out.println("Try function printStringSums with string1 = " + string1 + ", string2 = " + string2);
        printStringSums.printStringSum(string1, string2);
        System.out.println();

        System.out.println("6-----");
        UnaryOperator<LocalDate> f6 = (d) -> LocalDate.now().minusWeeks(1);

        System.out.println("7-----");
        Function<String, String> cutEvenString = s -> (s.length() % 2 == 0) ? s.substring(0, (s.length() / 2)) : "";
        System.out.println("Try function cutEvenString with s = " + "abcd: " + cutEvenString.apply("abcd"));
        System.out.println("Try function cutEvenString with s = " + "abcdc: " + cutEvenString.apply("abcdc"));

        System.out.println("8-----");
        RandomNumber giveMeNumber = () -> (int) (Math.random() * (1000 - 10 + 1) + 10);
        System.out.println("Try function giveMeNumber " + giveMeNumber.getRandomNumber());

        System.out.println("9-----");
        UnaryOperator<String> reverseString = s -> (new StringBuilder(s).reverse()).toString();
        System.out.println("Try function reverseString with s = " + "vereteno: " + reverseString.apply("vereteno"));

        System.out.println("10-----");
        //didn't finished yet

        System.out.println("11-----");
        Function<Integer, Boolean> evenOrNotNumber = s -> s % 2 == 0;
        System.out.println("Try function evenOrNotNumber with s = " + 45 + ": " + evenOrNotNumber.apply(45));
        System.out.println("Try function evenOrNotNumber with s = " + 46 + ": " + evenOrNotNumber.apply(46));

        System.out.println("12-----");
        Function<String, Boolean> ifStringMore3 = s -> s.length() > 3;
        System.out.println("Try function ifStringMore3 with s = " + "marusya : " + ifStringMore3.apply("marusya"));

        System.out.println("13-----");
        BiPredicate<String, Integer> ifStringMoreX = (s, x) -> s.length() > x;
        System.out.println("Try function ifStringMoreX with s = " + "verona " + "and x = " + "4: " + ifStringMoreX.test("verona", 4));
        System.out.println("Try function ifStringMoreX with s = " + "ver " + "and x = " + "4: " + ifStringMoreX.test("ver", 4));
    }
}
