package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task7 {
    //Вернуть количество четных чисел в массиве целых чисел

    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};

        System.out.println("countEvens([2, 1, 2, 3, 4]) → 3, actual result: " + countEvens(array1));
        System.out.println("countEvens([2, 2, 0]) → 3, actual result: " + countEvens(array2));
        System.out.println("countEvens([1, 3, 5]) → 0, actual result: " + countEvens(array3));
    }

    public static int countEvens(int[] nums) {
        if (nums == null) return 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (isItEvenNumber(nums[i])) {
                count++;
            }
        }
        if (isItEvenNumber(nums[nums.length - 1])){
            count++;
        }
        return count;
    }

    public static boolean isItEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
