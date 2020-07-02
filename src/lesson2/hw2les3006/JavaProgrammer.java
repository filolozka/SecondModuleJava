package lesson2.hw2les3006;

public class JavaProgrammer extends Programmer {
    String programmingLanguage = "Java";
    programmingLanguage java = lesson2.hw2les3006.programmingLanguage.JAVA;

    public JavaProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("I am C programmer. I write C Programs");
    }


    @Override
    public void codeReview() {
        System.out.println("This Java code is good");
    }
}
