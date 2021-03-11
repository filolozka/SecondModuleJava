package lessonsExamples.lesson2509.hwCollections;

import java.util.*;

public class SetTask2 {
    //С использованием множеств реализовать функцию, которая вернетповторяющиеся элементы из данного списка:
    // List<String> getDuplicates(List<String> input)Пример: ​ {“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”}
    // -> {“Ivan”, “Maria”}

    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<String>(
                Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan"));
        System.out.println(getDuplicates(listWithDuplicates));
    }

    public static List<String> getDuplicates(List<String> input) {
        if (input == null) return new ArrayList<>();
        Set<String> deletingDuplicates = new HashSet<>();
        List<String> listOfDuplicate = new ArrayList<>();
        for (String s : input) {
            boolean uniqueElement = deletingDuplicates.add(s);
            if (!uniqueElement) {
                listOfDuplicate.add(s);
            }
        }
        return listOfDuplicate;
    }
}
