package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

public class Task6 {
    //Дан массив целых чисел.Вернуть сумму двух первых элементов массива. Если
    //длина массива меньше двух, вернуть сумму всех элементов. Вернуть 0, если длина
    //массива равна нулю.

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array2 = {1, 1};
        int[] array3 = {1, 1, 1, 1};

        System.out.println("sum2([1, 2, 3]) → 3, actual result: " + sum2(array));
        System.out.println("sum2([1, 1]) → 2, actual result: " + sum2(array2));
        System.out.println("sum2([1, 1, 1, 1]) → 2, actual result: " + sum2(array3));
    }

    public static int sum2(int[] nums) {
        if (nums == null) return 0;
        if (nums.length > 1) {
            return nums[0] + nums[1];
        } else if (nums.length == 1) return nums[0];
        else return 0;
    }
}
