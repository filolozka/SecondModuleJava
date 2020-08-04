package lessonsExamples.lesson0308;

import java.util.Arrays;

public class Word {
    private int[] securedWord;
    private int sum;

    public Word(int[] securedWord, int sum) {
        this.securedWord = securedWord;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Word{" +
                "securedWord=" + Arrays.toString(securedWord) +
                ", sum=" + sum +
                '}';
    }
}
