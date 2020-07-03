package lesson3;

import lesson2.Employee;
import lesson2.hw2les3006.JavaProgrammer;
import lesson2.hw2les3006.Programmer;

public class ExampleExtends {
    public static void main(String[] args) {

    }

    public static Employee[] employees = {
            new Programmer("kolya1", 20.00),
            new Programmer("kolya2", 20.00),
            new Programmer("kolya3", 20.00),
            new Programmer("kolya4", 20.00),
            new JavaProgrammer("petr1", 30.00),
            new JavaProgrammer("petr2", 30.00),
            new JavaProgrammer("petr3", 30.00),
            new JavaProgrammer("petr4", 30.00),
            new Employee("Masha1", 30),
            new Employee("Masha2", 30),
            new Employee("Masha3", 30),
    };

    public static Employee[] getEmployees() {
        return employees;
    }

    public static Programmer[] getProgrammers() {

        int counter = 0;
        for (Employee employee : employees) {
            if (isProgrammer(employee)) {
                counter++;
            }
        }
        Programmer[] programmers = new Programmer[counter];
        if (counter > 0) {
            int i = 0;

            for (Employee employee : employees) {
                if (isProgrammer(employee)) {
                    programmers[i] = (Programmer) employee; //но это не очень безопасно - присваиваем из большего меньшему
                    i++;
                }
            }
        }
        return programmers;
    }

    private static boolean isProgrammer(Employee employee) { //в данном случае можно передать любого из видов employee, который его расширяет

        if (employee instanceof Programmer) { //
            return true;
        }

        return false;
    }
}
