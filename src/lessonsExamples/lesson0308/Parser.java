package lessonsExamples.lesson0308;

import java.util.Arrays;

public class Parser {
    private Word[] words;

    public Parser(int[] array) {
        this.words = parseIntArray(array);
    }

    private Word[] parseIntArray(int[] array) {
        if (array != null) {
            Word[] tempWords = new Word[countWordsInArray(array)];
            int currentArrayIndex = array.length - 1;
            int curTempWordsIndex = tempWords.length - 1;

            while (curTempWordsIndex >= 0) {
                boolean isCorrect = true;
                int expectedLength = array[currentArrayIndex--];
                int[] securedWord = new int[expectedLength];
                int expectedSum = array[currentArrayIndex--];

                if (array[currentArrayIndex--] > 0) {
                    isCorrect = false;
                    return null;
                }
                int realSum = 0;
                for (int i = expectedLength - 1; i >= 0; i--) {
                    securedWord[i] = array[currentArrayIndex--];
                    realSum += securedWord[i];
                }
                if (realSum != expectedSum) {
                    isCorrect = false;
                    return null;
                }
                    tempWords[curTempWordsIndex--] = new Word(securedWord, realSum);
            }
            return tempWords;
        }
        return null;
    }

    private int countWordsInArray(int[] array) {
        int res = 0;

        for (int i : array) {
            if (i < 0) {
                res++;
            }
        }
        return res;
    }

    @Override
    public String toString() {
        if (words != null) {
            return Arrays.toString(words);
        } else {
            return "error in the array";
        }
    }
}
