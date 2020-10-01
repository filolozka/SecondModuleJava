package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    //Есть список с целыми числами. Написать функцию, которая вернет список без
    //элементов, больше заданного.

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 6, 23, 76, 32));
        System.out.println(excludeTheElements(list, 30));
    }

    public static List<Integer> excludeTheElements(List<Integer> listToChange, int limitOfValueNumbers){
        List<Integer> result = new ArrayList<>();
        if (listToChange != null){
            for (Integer integer: listToChange) {
                if (integer.intValue() < limitOfValueNumbers){
                    result.add(integer);
                }
            }
        }
        return result;
    }


}
