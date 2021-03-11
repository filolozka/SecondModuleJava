package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void nonStart_stringAndString1_string() {
        assertEquals("ellohere", Task10.nonStart("Hello", "There"));
    }

    @Test
    void nonStart_stringAndString2_string() {
        assertEquals("avaode", Task10.nonStart("java", "code"));
    }

    @Test
    void nonStart_stringAndString3_string() {
        assertEquals("hotlava", Task10.nonStart("shotl", "java"));
    }

    @Test
    void nonStart_stringAndNull_string() {
        assertEquals("", Task10.nonStart(null, "java"));
    }
}