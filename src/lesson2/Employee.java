package lesson2;

public class Employee {
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override //это аннотация
    public String toString() {
        return "Employee " + name + "(" + salary + ")";
    }

    public void pay() {
        System.out.println("pay " + salary + " euro for " + name); //если не указать параметр, то вызовется этот метод как дефолтный
    }

    public void pay(int bonus) {
        System.out.println("pay " + (salary + bonus) + " euro for " + name); //если указан, то вот этот
    }

    public void work(){ //даже пустой метод жаёт возможность вызывать его у всех наследников
    }
}
