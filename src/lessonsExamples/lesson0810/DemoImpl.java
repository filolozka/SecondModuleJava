package lessonsExamples.lesson0810;

public class DemoImpl implements DemoInterface {
    int anInt;

    @Override
    public String getString(int i) {
        return null;
    }

    @Override
    public String transform(int i){
        anInt = 3;
        return "Hello World" + String.valueOf(i) + anInt;
    }
}
