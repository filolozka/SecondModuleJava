package lessonsExamples.lesson2608;

// "ktill" -> нечетные символы kil
// "ghbdtn" -> четные символы hdn
// как решать: action / condition
// - условие -> проверка длины на модуло 2
// потом цикл, где перебрать строчку
// условие - либо %2 == 0 либо ==1 -> собрать новые стринги

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Task {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
    }

    public static List<String> listHadler(
            List<String> list,
            Predicate<String> predicate,
            UnaryOperator<String> operator
    ) {
        List<String> resList = new ArrayList<>();
        for (String s: list) {
            if (predicate.test(s)) {
                resList.add(operator.apply(s));
            }
        }
        return resList;
    }
}
