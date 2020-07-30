package lessonsExamples.lesson12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3, -1, 2, 1, 4, 1, 2, 1, -7, 1, -1, -1};
        byte[] bytes2 = new byte[]{1, 2, 3, -1, 6, 3, 4, 1, 2, 1, -7, 11, 5, 1, -1};
        // пакет до первого отрицательного, первое число после него - контрольная сумма, потом - количество элементов
        // тз - проверить на корректность

        CodeWord[] words = getWord(bytes);
        System.out.println(Arrays.toString(words));
    }

    public static CodeWord[] getWord(byte[] array) {
        CodeWord[] wordArray = new CodeWord[wordCounter(array)];
        int amount = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (amount > 0) {
                    wordArray[j] = new CodeWord(amount);
                    j++;
                    amount = 0;
                }
            } else {
                amount += array[i];
            }
        }
        if (amount > 0) {
            wordArray[j] = new CodeWord(amount);
        }
        return wordArray;
    }

    public static int wordCounter(byte[] array) { //метод нужен, чтобы понять, какого размера необходим массив
        int wordCounter = 0;
        int wordLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (wordLength > 0) {
                    wordCounter++;
                    wordLength = 0;
                }
            } else {
                wordLength++;
            }
        }
        if (wordLength > 0) {
            wordCounter++;
        }
        return wordCounter;
    }
}
