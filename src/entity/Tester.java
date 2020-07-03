package entity;

public class Tester extends Employee {

    public Tester(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Tester: I'm testing program");
    }

    @Override
    public String toString() {
        return "Tester " + super.getName() + "(" + super.getSalary() + ")"; //вызываем геттер родительского класса
    }

}
