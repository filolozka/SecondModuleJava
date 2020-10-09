package lessonsExamples.lesson0810;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        DemoInterface demo = new DemoImpl();
        System.out.println(demo.transform(5));

        DemoInterface di = (a) -> { //реализация функционального метода, левая часть нужна, чтобы объявить переменную
            return String.valueOf(a);
        };

        //если решается одной строчкой, то можно так:
        DemoInterface di2 = String::valueOf;

        //тоже самое, но через анонимный класс
        DemoInterface di3 = new DemoInterface() {
            @Override
            public String getString(int i) {
                return null;
            }
        };

        //принимает строку и возвращает длину

        Function<String, Integer> f1 = (s) -> s.length();
        Integer hello = f1.apply("Hello");
        System.out.println(hello);

        //5 -> 25
        Function<Integer, Integer> f2 = (a) -> a * a;

        //"abc" -> false
        //"aabb" -> true
        Predicate<String> f3 = (s) -> s.length() % 2 == 0; //return s.length() % 2 == 0
        System.out.println(f3.test("aaab"));

        //sout -> печать
        Consumer<String> f4 = (s) -> System.out.println(s);

        //случайное число
        Supplier<Integer> f5 = () -> (int) (Math.random());

    ///////////////////////
        Function<Integer, Integer> ff1 = (a) -> a * a;
        doSomeMath(ff1, 10);

        Function<Integer, Integer> ff2 = (a) -> a * 10;
        doSomeMath(ff2, 24);

        Function<Integer, Integer> ff3 = (a) -> a % 2 == 0 ? 1 : -1;
        doSomeMath(ff3, 56);

        Function<String, String> getString = Main::getString;
}
    public static int doSomeMath(Function<Integer, Integer> f, int a) {
        return f.apply(a);
    }

    public static String getString(String input){
        return input;
    }
}
