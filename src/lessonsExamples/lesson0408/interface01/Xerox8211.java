package lessonsExamples.lesson0408.interface01;

public class Xerox8211 implements ScannAble, Printer {
    @Override
    public void print(String s) {
        System.out.println("Printed on Xerox: " + s);
    }

    @Override
    public String scan() {
        return "Xerox scanner text";
    }
}
