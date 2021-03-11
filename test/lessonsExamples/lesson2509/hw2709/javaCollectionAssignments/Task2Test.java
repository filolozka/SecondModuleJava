package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void namesLongMore4_listOfString_listOfString() {
        List testList = new ArrayList<>(Arrays.asList("Ivan",
                            "Maria", "Stephan", "John", "Amalia"));
        List result = new ArrayList<>(Arrays.asList("Maria", "Stephan", "Amalia"));
        assertEquals(result, Task2.namesLongMore4(testList));
    }

    @Test
    void namesLongMore4_emptyListOfString_emptylistOfString() {
        List testList = new ArrayList<String>();
        List result = new ArrayList<String>();
        assertEquals(result, Task2.namesLongMore4(testList));
    }

    @Test
    void namesLongMore4_null_emptylistOfString() {
        List testList = new ArrayList<String>();
        List result = new ArrayList<String>();
        assertEquals(result, Task2.namesLongMore4(testList));
    }

    @Test
    void checkTheLength_String5_true() {
        assertTrue(Task2.checkTheLength("Maria"));
    }

    @Test
    void checkTheLength_String6_true() {
        assertTrue(Task2.checkTheLength("Amalia"));
    }

    @Test
    void checkTheLength_String7_true() {
        assertTrue(Task2.checkTheLength("Stephan"));
    }

    @Test
    void checkTheLength_null_false() {
        assertFalse(Task2.checkTheLength(null));
    }
}