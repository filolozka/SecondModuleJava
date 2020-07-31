package lessonsExamples.lesson12.hw3007;

import lessonsExamples.lesson12.CodeWord;

public class Task {
    public static void main(String[] args) {
        byte[] bites = {1, 2, 3, -1, 6, 3, 2, 3, 4, 5, -2, 14, 4, 3, -3, 21, 3};
        // пакет до первого отрицательного, первое число после него - контрольная сумма, потом - количество элементов
        //ожидаем

        System.out.println("This package is "+ checkThePackage(bites));
    }

    public static boolean checkThePackage(byte[] array) {
        byte theSum = 0;
        byte referenceValue = 0;
        byte theAmount = 0;
        byte referenceAmount = 0;
        byte[] uncheckedArray;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (theSum > 0) {
                    referenceValue = array[i + 1];
                    referenceAmount = array[i + 2];
                    counter = i + 3;
                    if (referenceAmount == theAmount && referenceValue == theSum) {
                        System.out.println("This part of package ends " + array[i] + " is ok");

                        if ((array.length - theAmount) > 0) {
                            uncheckedArray = new byte[array.length - theAmount];
                            for (int j = 0; j < uncheckedArray.length; j++) {
                                if (counter <= uncheckedArray.length) {
                                    uncheckedArray[j] = array[counter];
                                    counter++;
                                }
                                else {
                                    break;
                                }
                            }
                            checkThePackage(uncheckedArray);
                        }
                        else {
                            return true;
                        }
                    }
                }
            } else {
                theAmount++;
                theSum += array[i];
            }
        }
        return false;
    }
}
