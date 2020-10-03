package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void countEvens_arrayWithFewEvenNumbers_int() {
        int[] array = {2, 1, 2, 3, 4};
        assertEquals(3, Task7.countEvens(array));
    }

    @Test
    void countEvens_arrayEvenNumbersAnd0_int() {
        int[] array = {2, 2, 0};
        assertEquals(3, Task7.countEvens(array));
    }

    @Test
    void countEvens_arrayWithoutEvenNumbers_int() {
        int[] array = {1, 3, 5};
        assertEquals(0, Task7.countEvens(array));
    }

    @Test
    void countEvens_emptyArray_0() {
        int[] array = new int[1];
        assertEquals(1, Task7.countEvens(array));
    }

    @Test
    void countEvens_null_0() {
        assertEquals(0, Task7.countEvens(null));
    }
}