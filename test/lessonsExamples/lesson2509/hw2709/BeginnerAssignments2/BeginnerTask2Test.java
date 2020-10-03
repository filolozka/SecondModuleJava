package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginnerTask2Test {

    @Test
    void diff21_numberLessThen21_difference() {
        assertEquals(2, Task2.diff21(19));
    }

    @Test
    void diff21_numberMoreThen21_differenceMultipliedToTwo() {
        assertEquals(8, Task2.diff21(25));
    }

    @Test
    void diff21_numberLessThen0_difference() {
        assertEquals(23, Task2.diff21(-2));
    }

    @Test
    void diff21_number21_zero() {
        assertEquals(21, Task2.diff21(0));
    }
}