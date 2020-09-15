package lessonsExamples.lesson1708.hw;

public class ParsingStringArray {
    private StringArray array;
    private CutAction cutString;
    private int maxLength = 4;

    public ParsingStringArray(StringArray array, CutAction cutString, int maxLength) {
        this.array = array;
        this.cutString = cutString;
        this.maxLength = maxLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public StringArray arrayParsing(){
        for (int i = 0; i < array.getArray().length; i++) {
            if (new LengthCondition().checkCondition(array.getArray()[i], maxLength)){
                cutString.doAction(array.getArray()[i], maxLength);
            }
        }
        return this.array;
    }
}
