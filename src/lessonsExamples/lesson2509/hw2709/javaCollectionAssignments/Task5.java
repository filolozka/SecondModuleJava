package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task5 {
    //Написать функцию, которая реверсирует список, возвращает список элементов
    //в обратном порядке. {1, 2, 3, 4, 5} -> {5, 4, 3, 2, 1}

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(reverseTheList(testList));
    }

    public static List<Integer> reverseTheList (List<Integer> list){
        List<Integer> reversedList = new ArrayList<>();
        if (list != null) {
            reversedList.addAll(list);
            Collections.reverse(reversedList);
        }
        return reversedList;
    }
}
