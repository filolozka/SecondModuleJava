package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

public class Task5 {
    //Даны два массива целых чисел.Вернуть true если у них одинаковый первый или
    //последний элемент. Оба массива длины 1 или более.

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 3, 2};
        int[] array3 = {7, 3};
        int[] array4 = {1, 3};

        System.out.println("commonEnd([1, 2, 3], [7, 3]) → true, actually result: " + commonEnd(array1, array3));
        System.out.println("commonEnd([1, 2, 3], [7, 3, 2]) → false, actually result:  " + commonEnd(array1, array2));
        System.out.println("commonEnd([1, 2, 3], [1, 3]) → true, actually result:  " + commonEnd(array1, array4));
        System.out.println(commonEnd(null, array4));
    }

    public static boolean commonEnd(int[] a, int[] b) {
        if (a != null && b != null) {
            return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
        } else {
            return false;
        }
    }
}
