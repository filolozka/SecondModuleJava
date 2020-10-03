package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void sum2_arrayMore2Length_sum() {
        int[] array = {1, 2, 3};
        assertEquals(3, Task6.sum2(array));
    }

    @Test
    void sum2_arrayLength2_sum() {
        int[] array = {1, 1};
        assertEquals(2, Task6.sum2(array));
    }

    @Test
    void sum2_array1Length_firstNumber() {
        int[] array = {5};
        assertEquals(5, Task6.sum2(array));
    }

    @Test
    void sum2_emptyArray_0() {
        int[] array = new int[1];
        assertEquals(0, Task6.sum2(array));
    }

    @Test
    void sum2_null_0() {
        assertEquals(0, Task6.sum2(null));
    }
}