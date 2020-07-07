package emloyeesProject.repository.entity;

public class LazyEmployee extends Employee {

   public LazyEmployee(String name, double salary){
        super(name, salary);
    }

    @Override
    public void work() {

    }
}
