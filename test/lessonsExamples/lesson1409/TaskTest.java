package lessonsExamples.lesson1409;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void string_arrayListWithDoubles_arrayListWithUniqueString() {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Nadezhda");
        listOfString.add("Ivan");
        listOfString.add("Nadezhda");
        listOfString.add("Sergey");
        listOfString.add("Vasilyj");
        listOfString.add("Petya");
        listOfString.add("Petya");
        listOfString.add("Vasilyj");
        listOfString.add("Vasilyj");

        Comparator<String> test = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };


        List<String> result = new ArrayList<>();
        result.add("Nadezhda");
        result.add("Ivan");
        result.add("Sergey");
        result.add("Vasilyj");
        result.add("Petya");
        result.sort(test);

        listOfString = Task.getUniqueString(listOfString);
        listOfString.sort(test);
        assertEquals(result, listOfString);
    }

    @Test
    void string_emptyArrayList_arrayList() {
        List<String> listOfString = new ArrayList<>();
        List<String> result = new ArrayList<>();
        assertEquals(result, Task.getUniqueString(listOfString));
    }

    @Test
    void string_null_arrayList() {
        List<String> result = new ArrayList<>();
        assertEquals(result, Task.getUniqueString(null));
    }

        @Test
    void person_arrayListWithDoubles_arrayListWithUniqueString() {
            Comparator<Person> test = new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            };

            List<Person> personList = Arrays.asList(
                    new Person("Vasya"),
                    new Person("Masha"),
                    new Person("Vasya"),
                    new Person("Kolya"),
                    new Person("Kolya"),
                    new Person("Kostya"),
                    new Person("Kostya"),
                    new Person("Valya"),
                    new Person("Valya"),
                    new Person("Kostya")
            );

            List<Person> result = Arrays.asList(
                    new Person("Vasya"),
                    new Person("Masha"),
                    new Person("Kolya"),
                    new Person("Kostya"),
                    new Person("Valya")
            );
            result.sort(test);

            personList = Task.getUniquePerson(personList);
            personList.sort(test);

            assertEquals(result, personList);
        }

    @Test
    void person_emptyArrayList_arrayList() {
        List<Person> personList = new ArrayList<>();
        List<Person> result = new ArrayList<>();
        assertEquals(result, Task.getUniquePerson(personList));
    }

    @Test
    void person_null_arrayList() {
        List<Person> result = new ArrayList<>();
        assertEquals(result, Task.getUniquePerson(null));
    }
}