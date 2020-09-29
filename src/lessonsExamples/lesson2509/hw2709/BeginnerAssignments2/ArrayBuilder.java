package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;
// Task8
// Вернуть версию входного массива, где каждое нулевое значение заменено
//максимальным нечетным значением, справа от нуля. Если нечетных числе справа от
//нуля нет, то оставляем ноль.

public class ArrayBuilder {
    private int[] sourceArray;
    private int[] changedArray;
    //private int[] tempArray;

    public ArrayBuilder(int[] sourceArray) {
        this.sourceArray = sourceArray;
    }

    public int[] zeroMax() {
        if (sourceArray == null) {
            sourceArray = new int[1];
        }
        int[] numbersToTheRightOfZero = new int[sourceArray.length];
        for (int i = sourceArray.length - 1; i >= 0; i--) {
            if (sourceArray[i] != 0) {
                numbersToTheRightOfZero[i] = sourceArray[i];
            } else {
                numbersToTheRightOfZero[i] = findMaxOddNumber(numbersToTheRightOfZero);
            }
        }
        changedArray = numbersToTheRightOfZero.clone();
        return changedArray;
    }

    public int findMaxOddNumber(int[] tempArray) {
        int maxOddNumber = 0;
        if (tempArray == null) return maxOddNumber;
        for (int i = sourceArray.length - 1; i >= 0; i--) {
            if (maxOddNumber < tempArray[i] && tempArray[i] % 2 != 0) {
                maxOddNumber = tempArray[i];
            }
        }
        return maxOddNumber;
    }

    public int[] getChangedArray() {
        return changedArray;
    }

    public void setSourceArray(int[] sourceArray) {
        this.sourceArray = sourceArray;
    }
}
