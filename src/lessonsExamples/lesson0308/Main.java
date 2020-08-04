package lessonsExamples.lesson0308;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, 2, 3, -2,  17, 3, 9, 1, 3, 4, -6, 5, 6, -5, 28, 6, 2, 3, 4, 1, 1, -9, 11, 5};
        Parser parser = new Parser(array);
        System.out.println(parser);
    }
}
