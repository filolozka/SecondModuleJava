package lessonsExamples.lesson1708.hw;

import java.util.Arrays;

public class StringArray {
    private String[] array;

    public StringArray(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "StringArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
