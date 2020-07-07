package emloyeesProject.repository.entity;

public class JavaScriptProgrammer extends Programmer {
    private String programmingLanguage = "JavaScript";

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /*programmingLanguage js = emloyeesProject.repository.entity.programmingLanguage.JAVASCRIPT;
*/
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
