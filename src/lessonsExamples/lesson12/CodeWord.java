package lessonsExamples.lesson12;


public class CodeWord {
    private int word;

    public CodeWord(int word) {
        this.word = word;
    }

    public int getWord() {
        return word;
    }


    @Override
    public String toString() {
        return "CodeWord{" +
                "word=" + word +
                '}';
    }


}
