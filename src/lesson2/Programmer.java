package lesson2;

public class Programmer extends Employee {

    public Programmer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Programmer: I'm coding");
    }
}
