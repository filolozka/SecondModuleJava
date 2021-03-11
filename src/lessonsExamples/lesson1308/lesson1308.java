package lessonsExamples.lesson1308;

import java.util.Arrays;

public class lesson1308 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};
        //метод, который удалит из него какой-либо элемент
        ArrayHandler arrayHandler = new ArrayHandler(arr);
        System.out.println(Arrays.toString(arrayHandler.getArray()));
        System.out.println("-------------------------------");
        arrayHandler.remove3(3);
        System.out.println(Arrays.toString(arrayHandler.getArray()));

    }
}
