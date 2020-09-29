package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Task8ArrayBuilderTest {

    @Test
    void zeroMax_arrayAddNumberNextZero_changedArray() {
        int[] result = {5, 5, 3, 3};
        int[] arrayToChange = {0, 5, 0, 3};
        ArrayBuilder test = new ArrayBuilder(arrayToChange);
        assertArrayEquals(result, test.zeroMax());
    }

    @Test
    void zeroMax_arrayAddNumberNextZeroAndAddNumberOnTheAnd_changedArray() {
        int[] result = {1, 1, 0};
        int[] arrayToChange = {0, 1, 0};
        ArrayBuilder test = new ArrayBuilder(arrayToChange);
        assertArrayEquals(result, test.zeroMax());
    }

    @Test
    void zeroMax_arrayZeroOnTheAnd_array() {
        int[] result = {1, 1, 0};
        int[] arrayToChange = {1, 1, 0};
        ArrayBuilder test = new ArrayBuilder(arrayToChange);
        assertArrayEquals(result, test.zeroMax());
    }

    @Test
    void zeroMax_null_emptyArray() {
        int[] result = new int[1];
        ArrayBuilder test = new ArrayBuilder(null);
        assertArrayEquals(result, test.zeroMax());
    }

    @Test
    void zeroMax_emptyArray_emptyArray() {
        int[] result = new int[1];
        int[] arrayToChange = new int[1];
        ArrayBuilder test = new ArrayBuilder(arrayToChange);
        assertArrayEquals(result, test.zeroMax());
    }

    @Test
    void findMaxOddNumber_emptyArray_0() {
        int[] emptyArray = new int[1];
        ArrayBuilder test = new ArrayBuilder(emptyArray);
        assertEquals(0, test.findMaxOddNumber(emptyArray));
    }

    @Test
    void findMaxOddNumber_tempArraySize1_oddNumber() {
        ArrayBuilder test = new ArrayBuilder(new int[]{0, 5, 0, 3});
        int[] tempArrayForFindMaxOdd = new int[]{0, 0, 0, 3};
        assertEquals(3, test.findMaxOddNumber(tempArrayForFindMaxOdd));
    }

    @Test
    void findMaxOddNumber_tempArraySizeMore1_oddNumber() {
        ArrayBuilder test = new ArrayBuilder(new int[]{0, 3, 0, 5});
        int[] tempArrayForFindMaxOdd = {0, 3, 5, 5};
        assertEquals(5, test.findMaxOddNumber(tempArrayForFindMaxOdd));
    }

    @Test
    void findMaxOddNumber_tempArraySizeMore1WithoutOddNumbers_oddNumber() {
        ArrayBuilder test = new ArrayBuilder(new int[]{0, 8, 4, 2});
        int[] tempArrayForFindMaxOdd = {0, 8, 4, 2};
        assertEquals(0, test.findMaxOddNumber(tempArrayForFindMaxOdd));
    }
}