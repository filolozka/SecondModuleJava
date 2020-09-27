package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void endUp_stringMore3_upperCase() {
        assertEquals("HeLLO", Task3.endUp("Hello"));
    }

    @Test
    void endUp_stringMore3WithSpace_upperCase() {
        assertEquals("hi thERE", Task3.endUp("hi there"));
    }

    @Test
    void endUp_stringLess3_upperCase() {
        assertEquals("HI", Task3.endUp("hi"));
    }
}