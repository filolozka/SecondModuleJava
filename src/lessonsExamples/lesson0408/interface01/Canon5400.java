package lessonsExamples.lesson0408.interface01;

public class Canon5400 implements Printer {
    @Override
    public void print(String  s) {
        System.out.println(s);
    }
}
