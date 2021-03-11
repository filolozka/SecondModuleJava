package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
    //Объединить два списка в один.
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(123, 356, 436, 2342));
        list1.addAll(list2);
        System.out.println(list1);
    }
}
