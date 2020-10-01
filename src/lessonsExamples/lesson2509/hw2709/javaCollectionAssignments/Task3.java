package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    //Есть два списка одинаковой длины с числами. Написать функцию, которая
    //вернет список с элементами Yes или No, где значение на i-том месте зависит от
    //того, равны ли элементы двух списков под номером i. Например, {1, 2, 3, 4} и {5,
    //2, 3, 8} вернет {No, Yes, Yes, No}

    //Решение - см ListChecker и ListCheckerTest

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 2, 3, 8));
        ListsChecker checker = new ListsChecker(list1, list2);
        System.out.print("Expected result is  {No, Yes, Yes, No}, actual: " + checker.checkTwoLists());
    }


}
