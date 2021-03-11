package lessonsExamples.lesson0610;

public class Demo {
    public static void main(String[] args) {

        DemoInterface demo = new DemoInterface() {
            @Override
            public String getString(String s) {
                System.out.println(s);
                return s.toUpperCase();
            }
        };

        DemoInterface demoFunctional = String::toUpperCase;
    }
}

