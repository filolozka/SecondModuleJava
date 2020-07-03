package lessonsExamples.lesson1;

public class Main {
    public static void main(String[] args) {
        method(4);
    }

    private static int method(int i) {
        System.out.println("start i = " + i);
        if (i > 1){
            method(i / 2);
            method(i / 4);
        }
        System.out.println("final i = " + i);
        return 1;
    }
}
