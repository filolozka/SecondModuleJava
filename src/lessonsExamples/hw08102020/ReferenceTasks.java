package lessonsExamples.hw08102020;

import lessonsExamples.lesson0610.Demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ReferenceTasks {
    public static void main(String[] args) {

        UnaryOperator<String> lowerString = ReferenceTasks :: getLowerString;
        System.out.println("Try the function lowerString: " + lowerString.apply("BARbaRosso"));

        Consumer<String> printStr = ReferenceTasks :: printString;
        printStr.accept("BARbaRosso");

        UnaryOperator<Integer> squareRoot = ReferenceTasks :: getSquareRoot;
        System.out.println("Try the function squareRoot: " + squareRoot.apply(9));

        Function<String, String> cutEvenString = ReferenceTasks :: cutEvenString;
        System.out.println("Try function cutEvenString with s = " + "abcd: " + cutEvenString.apply("abcd"));
    }

    public static String getLowerString(String input){
        return input.toLowerCase();
    }

    public static void printString(String input){
        System.out.print("String is: " + input);
    }

    public static int getSquareRoot(int number){
        return (int) Math.sqrt(number);
    }

    public static String cutEvenString (String string){
        return (string.length() % 2 == 0) ? string.substring(0, (string.length() / 2)) : "";
    }
}
