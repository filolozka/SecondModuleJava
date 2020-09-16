package lessonsExamples.lesson1509;

import lessonsExamples.lesson1409.Person;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void getListOfDuplicated_twoLists_newListOfDuplicatedPerson(){
        List<Person> listOne = Arrays.asList(
                new Person("Oleg"),
                new Person("Lora"),
                new Person("Oleg"),
                new Person("David"),
                new Person("Petya")
        );

        List<Person> listTwo = Arrays.asList(
                new Person("Oleg"),
                new Person("Anna"),
                new Person("Roman"),
                new Person("Lora"),
                new Person("Vasiliy")
        );

        Set<Person> set = new HashSet<>();
        set.add(new Person("Oleg"));
        set.add(new Person("Lora"));

        assertEquals(set, new HashSet<Person>(Main.getListOfDuplicated(listOne, listTwo)));
    }

    @Test
    public void getListOfDuplicated_emptyList_emptyList(){
        List<Person> listOne = new ArrayList<>();

        List<Person> listTwo = Arrays.asList(
                new Person("Oleg"),
                new Person("Anna"),
                new Person("Roman"),
                new Person("Lora"),
                new Person("Vasiliy")
        );

            assertEquals(new ArrayList<Person>(), Main.getListOfDuplicated(listOne, listTwo));
        }

    @Test
    public void getListOfDuplicated_twoListsWithoutDuplicated_newEmptyList(){
        List<Person> listOne = Arrays.asList(
                new Person("Oleg"),
                new Person("Lora"),
                new Person("Oleg"),
                new Person("David"),
                new Person("Petya")
        );

        List<Person> listTwo = Arrays.asList(
                new Person("Anna"),
                new Person("Roman"),
                new Person("Vasiliy")
        );

        assertEquals(new ArrayList<Person>(), Main.getListOfDuplicated(listOne, listTwo));
    }

    @Test
    public void getListOfDuplicated_oneListNull_newEmptyList(){
        List<Person> listOne = Arrays.asList(
                new Person("Oleg"),
                new Person("Lora"),
                new Person("Oleg"),
                new Person("David"),
                new Person("Petya")
        );

        List<Person> listTwo = Arrays.asList(
                new Person("Anna"),
                new Person("Roman"),
                new Person("Vasiliy")
        );

        assertEquals(new ArrayList<Person>(), Main.getListOfDuplicated(null, listTwo));
        assertEquals(new ArrayList<Person>(), Main.getListOfDuplicated(listOne, null));
    }
}