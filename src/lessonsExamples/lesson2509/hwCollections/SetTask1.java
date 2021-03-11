package lessonsExamples.lesson2509.hwCollections;

import java.util.*;

public class SetTask1 {
    //С использованием множеств (Set) реализовать функцию, которая вернет список без повторяющихся элементов:
    // List<String> removeDuplicates(List<String> input)Пример:​ {“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”}
    // -> {“Ivan”, “Maria”, “Piotr”,“Anna”

    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<String>(Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan"));
        System.out.println(removeDuplicates(listWithDuplicates));
    }

    public static List<String> removeDuplicates(List<String> input){
        if (input == null) return new ArrayList<>();
        Set<String> deletingDuplicates = new HashSet<>(input);
        return new ArrayList<>(deletingDuplicates);
    }
}
