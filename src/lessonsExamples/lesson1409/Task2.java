package lessonsExamples.lesson1409;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        //список строк -> получить Map, в котором будут пары соответствия имя + количество раз, которое встречалось в списке

        List<String> listOfString2 = new ArrayList<>();
        listOfString2.add("Olga");
        listOfString2.add("Vadim");
        listOfString2.add("Olga");
        listOfString2.add("Sergey");
        listOfString2.add("Vasya");
        listOfString2.add("Petya");
        listOfString2.add("Vasya");
        listOfString2.add("Vasya");

        System.out.println(getMapOfStringsAndTheNumberOfRepetitions(listOfString2).toString());

        List<Person> personList = Arrays.asList(
                new Person("Vasya"),
                new Person("Masha"),
                new Person("Vasya"),
                new Person("Kolya"),
                new Person("Kostya"),
                new Person("Kostya"),
                new Person("Valya"),
                new Person("Kostya")
        );
        System.out.println(getMapOfPersonsAndTheNumberOfRepetitions(personList).toString());
        System.out.println(getMapOfPersonsAndRepeatsOrNot(personList).toString());
    }

    public static Map<String, Integer> getMapOfStringsAndTheNumberOfRepetitions(List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        if (list == null) return result;
        for (String string : list) {
            if (result.containsKey(string)) {
//                Integer i = result.get(string); //value от string из Map
//                i++;
                result.put(string, result.get(string) + 1);
            } else {
                result.put(string, 1);
            }
        }
        return result;
    }

    public static Map<Person, Integer> getMapOfPersonsAndTheNumberOfRepetitions(List<Person> list) {
        Map<Person, Integer> result = new HashMap<>();
        if (list == null) return result;
        for (Person person : list) {
            if (result.containsKey(person)) {
                result.put(person, result.get(person) + 1);
            } else {
                result.put(person, 1);
            }
        }
        return result;
    }

    public static Map<Person, Boolean> getMapOfPersonsAndRepeatsOrNot(List<Person> list) {
        Map<Person, Boolean> result = new HashMap<>();
        if (list == null) return result;
        for (Person person : list) {
            if (result.containsKey(person)) {
                result.put(person, true);
            } else {
                result.put(person, false);
            }
        }
        return result;
    }
}
