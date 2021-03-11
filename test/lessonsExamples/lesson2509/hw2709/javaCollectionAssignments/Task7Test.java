package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void excludeTheElements_listOfIntegerAndInt_list() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 6, 23, 76, 32));
        List<Integer> result = new ArrayList<Integer>(Arrays.asList(4, 6, 23));
        assertEquals(result, Task7.excludeTheElements(list, 30));
    }

    @Test
    void excludeTheElements_nullAndInt_list() {
        List<Integer> result = new ArrayList<Integer>();
        assertEquals(result, Task7.excludeTheElements(null, 30));
    }
}