package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

import java.util.Arrays;

public class Task8 {
    // Решение - см. класс ArrayBuilder и тесты к нему - Task8ArrayBuilderTest
    // Вернуть версию входного массива, где каждое нулевое значение заменено
    // максимальным нечетным значением, справа от нуля. Если нечетных числе справа от
    // нуля нет, то оставляем ноль.

    public static void main(String[] args) {
        ArrayBuilder test = new ArrayBuilder(new int[]{0, 5, 0, 3});
        test.zeroMax();
        System.out.println("Changed array: " + Arrays.toString(test.getChangedArray()));

        ArrayBuilder test2 = new ArrayBuilder(new int[]{0, 3, 6, 0});
        System.out.println("Changed array: " + Arrays.toString(test2.zeroMax()));
    }
}
