package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTo21Test {

    @Test
    void compareToDiff21_numberLess21_difference() {
        CompareTo21 test = new CompareTo21(10);
        assertEquals(11, test.diff21());
    }

    void compareToDiff21_numberMoreThen21_differenceMultipliedToTwo() {
        CompareTo21 test = new CompareTo21(25);
        assertEquals(8, test.diff21());
    }

    @Test
    void compareToDiff21_numberLessThen0_difference() {
        CompareTo21 test = new CompareTo21(-2);
        assertEquals(23, test.diff21());
    }

    @Test
    void compareToDiff21_number21_zero(){
        CompareTo21 test = new CompareTo21(21);
        assertEquals(0, test.diff21());
    }
}