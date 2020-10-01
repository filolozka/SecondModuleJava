package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    //Есть список с именами: Ivan, Maria, Stephan, John, Amalia. Написать функцию,
    //которая вернет список, в котором не содержатся имена исходного списка длиной 4.

    public static void main(String[] args) {
        System.out.println(namesLongMore4(new ArrayList<String>(Arrays.asList("Ivan",
                "Maria", "Stephan", "John", "Amalia"))));
    }

    public static List<String> namesLongMore4(List<String> names) {
        List<String> listOfNamesLenghtMore4 = new ArrayList<String>();
        if (names != null) {
            for (String name : names) {
                if (checkTheLength(name)) {
                    listOfNamesLenghtMore4.add(name);
                }
            }
        }
        return listOfNamesLenghtMore4;
    }

    public static boolean checkTheLength(String name) {
        if (name == null) return false;
        return name.length() != 4;
    }
}
