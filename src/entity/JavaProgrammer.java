package entity;

public class JavaProgrammer extends Programmer {
    private String programmingLanguage = "Java";

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /*programmingLanguage java = entity.programmingLanguage.JAVA;
     */

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
