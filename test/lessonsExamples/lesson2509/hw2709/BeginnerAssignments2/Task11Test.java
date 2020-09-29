package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    @Test
    void middleTwo_string1_substring() {
        assertEquals("ri", Task11.middleTwo("string"));
    }

    @Test
    void middleTwo_string2_substring() {
        assertEquals("od", Task11.middleTwo("code"));
    }

    @Test
    void middleTwo_string3_substring() {
        assertEquals("ct", Task11.middleTwo("Practice"));
    }

    @Test
    void middleTwo_null_substring() {
        assertEquals("", Task11.middleTwo(null));
    }

    @Test
    void getIndexToStart_string1_int() {
        assertEquals(2, Task11.getIndexToStart("string"));
    }

    @Test
    void getIndexToStart_string2_int() {
        assertEquals(1, Task11.getIndexToStart("code"));
    }

    @Test
    void getIndexToStart_string3_int() {
        assertEquals(3, Task11.getIndexToStart("Practice"));
    }
}