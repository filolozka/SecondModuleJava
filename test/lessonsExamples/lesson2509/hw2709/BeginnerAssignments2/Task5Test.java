package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void commonEnd_intArray1_intArray2_commonEnd_true() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 3};
        assertTrue(Task5.commonEnd(array1, array2));
    }

    @Test
    void commonEnd_intArray1_intArray2_commonStart_true() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 5};
        assertTrue(Task5.commonEnd(array1, array2));
    }

    @Test
    void commonEnd_intArray1_intArray2_commonStartCommonEnd_true() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 3};
        assertTrue(Task5.commonEnd(array1, array2));
    }

    @Test
    void commonEnd_intArray1_intArray2_withoutCommon_false() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 3, 2};
        assertFalse(Task5.commonEnd(array1, array2));
    }

    @Test
    void commonEnd_null_intArray1_false() {
        int[] array1 = {1, 2, 3};
        assertFalse(Task5.commonEnd(array1, null));
    }

    @Test
    void commonEnd_emptyArray_intArray2_false() {
        int[] array1 = new int[1];
        int[] array2 = {1, 2, 3};
        assertFalse(Task5.commonEnd(array1, array2));
    }
}