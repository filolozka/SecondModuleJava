package lessonsExamples.lesson0810;

public interface DemoInterface {
    String SOME_STRING = "Hello"; //по умолчанию паблик и статик
    String getString(int i);

    default String transform(int i){
        return "Hello, World";
    }
}
