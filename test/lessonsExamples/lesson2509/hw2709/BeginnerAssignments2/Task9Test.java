package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {
//System.out.println("Expected [2, 5, 3, 6] → " + Arrays.toString(shiftLeft(new int[]{6, 2, 5, 3})));
//        System.out.println("Expected [2, 1] → " + Arrays.toString(shiftLeft(new int[]{1, 2})));
//        System.out.println("Expected [1] → " + Arrays.toString(shiftLeft(new int[]{1})));

    @Test
    void shiftLeft_arrayFourNumbers_array() {
        int[] arrayToShift = {6, 2, 5, 3};
        int[] changedArray = {2, 5, 3, 6};
        assertArrayEquals(changedArray, Task9.shiftLeft(arrayToShift));
    }

    @Test
    void shiftLeft_arrayTwoNumbers_array() {
        int[] arrayToShift = {1, 2};
        int[] changedArray = {2, 1};
        assertArrayEquals(changedArray, Task9.shiftLeft(arrayToShift));
    }

    @Test
    void shiftLeft_arrayOneNumber_array() {
        int[] arrayToShift = {1};
        int[] changedArray = {1};
        assertArrayEquals(changedArray, Task9.shiftLeft(arrayToShift));
    }

    @Test
    void shiftLeft_null_emptyArray() {
        int[] changedArray = new int[1];
        assertArrayEquals(changedArray, Task9.shiftLeft(null));
    }
}