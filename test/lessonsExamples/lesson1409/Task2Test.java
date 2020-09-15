package lessonsExamples.lesson1409;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void ArrayList_MapOfStrings() {
        List<String> listOfString2 = new ArrayList<>();
        listOfString2.add("Olga");
        listOfString2.add("Vadim");
        listOfString2.add("Olga");
        listOfString2.add("Sergey");
        listOfString2.add("Vasya");
        listOfString2.add("Petya");
        listOfString2.add("Vasya");
        listOfString2.add("Vasya");

        Map<String, Integer> result = new HashMap<>();
        result.put("Petya", 1);
        result.put("Olga", 2);
        result.put("Vadim", 1);
        result.put("Vasya", 3);
        result.put("Sergey", 1);

        assertEquals(result, Task2.getMapOfStringsAndTheNumberOfRepetitions(listOfString2));
    }

    @Test
    void emptyArrayList_MapOfStrings() {
        List<String> listOfString2 = new ArrayList<>();
        Map<String, Integer> result = new HashMap<>();
        assertEquals(result, Task2.getMapOfStringsAndTheNumberOfRepetitions(listOfString2));
    }

    @Test
    void null_MapOfStrings() {
        List<String> listOfString2 = new ArrayList<>();
        Map<String, Integer> result = new HashMap<>();
        assertEquals(result, Task2.getMapOfStringsAndTheNumberOfRepetitions(listOfString2));
    }

    @Test
    void mapOfPersonsAndRepetitions_personList_mapPersonInteger() {
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

        Map<Person, Integer> result = new HashMap<>();
        result.put(new Person ("Vasya"), 2);
        result.put(new Person ("Kostya"), 3);
        result.put(new Person("Valya"), 1);
        result.put(new Person("Kolya"), 1);
        result.put(new Person("Masha"), 1);

        assertEquals(result, Task2.getMapOfPersonsAndTheNumberOfRepetitions(personList));
    }

    @Test
    void mapOfPersonsAndRepetitions_emptyPersonList_mapPersonInteger() {
        List<Person> personList = new ArrayList<>();
        Map<Person, Integer> result = new HashMap<>();
        assertEquals(result, Task2.getMapOfPersonsAndTheNumberOfRepetitions(personList));
    }

    @Test
    void mapOfPersonsAndRepetitions_null_mapPersonInteger() {
        Map<Person, Integer> result = new HashMap<>();
        assertEquals(result, Task2.getMapOfPersonsAndTheNumberOfRepetitions(null));
    }

    @Test
    void mapOfPersonsAndIsItRepeats_personList_mapPersonBoolean() {
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

        Map<Person, Boolean> result = new HashMap<>();
        result.put(new Person ("Vasya"), true);
        result.put(new Person ("Kostya"), true);
        result.put(new Person("Valya"), false);
        result.put(new Person("Kolya"), false);
        result.put(new Person("Masha"), false);

        assertEquals(result, Task2.getMapOfPersonsAndRepeatsOrNot(personList));
    }

    @Test
    void mapOfPersonsAndIsItRepeats_emptyPersonList_mapPersonBoolean() {
        List<Person> personList = new ArrayList<>();
        Map<Person, Boolean> result = new HashMap<>();
        assertEquals(result, Task2.getMapOfPersonsAndRepeatsOrNot(personList));
    }

    @Test
    void mapOfPersonsAndIsItRepeats_null_mapPersonBoolean() {
        Map<Person, Boolean> result = new HashMap<>();
        assertEquals(result, Task2.getMapOfPersonsAndRepeatsOrNot(null));
    }
}