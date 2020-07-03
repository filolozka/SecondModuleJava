package entity;

public class CProgrammer extends Programmer {
    String programmingLanguage = "C";

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /*programmingLanguage cLanguage = entity.programmingLanguage.C;*/

    public CProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("I am C programmer. I write C Programs");
    }

    @Override
    public void codeReview() {
        System.out.println("This C code is good");
    }
}
