package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import java.util.Arrays;

public class Task9 {
    //Вернуть массив, смещенный влево на один индекс. Можно вернуть измененный данный массив, а можно вернуть новый.

    public static void main(String[] args) {
        System.out.println("Expected [2, 5, 3, 6] → " + Arrays.toString(shiftLeft(new int[]{6, 2, 5, 3})));
        System.out.println("Expected [2, 1] → " + Arrays.toString(shiftLeft(new int[]{1, 2})));
        System.out.println("Expected [1] → " + Arrays.toString(shiftLeft(new int[]{1})));
    }

    public static int[] shiftLeft(int[] nums) {
        if (nums == null) return new int[1];
        int[] result = new int[nums.length];
        for (int i = nums.length - 1, j = i - 1; i > 0; i--) {
            result[j] = nums[i];
            j--;
        }
        if (result[nums.length - 1] == 0) {
            result[nums.length - 1] = nums[0];
        }
        return result;
    }
}
