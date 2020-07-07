package emloyeesProject.repository.entity;

public class Manager extends Employee {
    double managerBonus;

    public Manager(String name, double salary, double managerBonus) {
        super(name, salary);
        this.managerBonus = managerBonus;
    }

    @Override
    public void pay() {
        System.out.println("pay salary and manager's bonus " + (super.getSalary() + managerBonus) + " euro for " + super.getName());
    }

    public void work(){
        System.out.println("I'm working hard");
    }
}
