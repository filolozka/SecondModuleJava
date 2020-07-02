package lesson1;

import java.util.Arrays;

public class RepeatMergeSort {
    public static void main(String[] args) {
        int[] unsortedArray = getArray(15, 30, 200);
        System.out.println(Arrays.toString(unsortedArray));
        //sort(unsortedArray);
    }

    private static void sort(int[] array, int to, int from) {
        if (to - from > 1) {
            int middle = (from + to) / 2;
            sort(array, middle, to);
            sort(array, from, middle);
            merge(array, from, to, middle);
        }

    }

    private static void merge(int[] array, int from, int to, int middle) {
        int[] leftPeace = Arrays.copyOfRange(array, from, middle);
        int[] rightPeace = Arrays.copyOfRange(array, middle, to);

        for (int i = 1; i < array.length; i++) {
            if (leftPeace[i] > rightPeace[i]){
                int temp;
                        //temp++;
            }
        }
    }

    private static int[] getArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = (int) (Math.random() * ((max - min + 1) + min));
        }
        return array;
    }


}
