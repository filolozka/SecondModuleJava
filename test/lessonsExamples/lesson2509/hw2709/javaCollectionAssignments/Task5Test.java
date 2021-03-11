package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void reverseTheList_list_reversedList() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> reversedList = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        assertEquals(reversedList, Task5.reverseTheList(testList));
    }

    @Test
    void reverseTheList_null_reversedList() {
        List<Integer> reversedList = new ArrayList<>();
        assertEquals(reversedList, Task5.reverseTheList(null));
    }
}