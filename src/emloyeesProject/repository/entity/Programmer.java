package emloyeesProject.repository.entity;

public abstract class Programmer extends Employee {
    public Programmer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public abstract void work();
    public abstract void codeReview();


}
