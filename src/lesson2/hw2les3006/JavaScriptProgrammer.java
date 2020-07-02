package lesson2.hw2les3006;

public class JavaScriptProgrammer extends Programmer {
    String programmingLanguage = "JavaScript";
    programmingLanguage js = lesson2.hw2les3006.programmingLanguage.JAVASCRIPT;

    public JavaScriptProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("I am JavaScript programmer. I do frontend");
    }

    @Override
    public void codeReview() {
        System.out.println("This JavaScript code is good");
    }
}
