package emloyeesProject.repository.entity;

public class Manager extends Employee implements ManageAble {
    double managerBonus;

    public Manager(String name, double salary, double managerBonus) {
        super(name, salary);
        this.managerBonus = managerBonus;
    }

    public void manage(){
        System.out.println("All managers can manage!");
    }

    @Override
    public void pay() {
        System.out.println("pay salary and manager's bonus " + (super.getSalary() + managerBonus) + " euro for " + super.getName());
    }

    public void work(){
        System.out.println("I'm working hard");
    }
}
