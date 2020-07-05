package lessonsExamples.lesson3;

import emloyeesProject.repository.entity.*;

public class ExampleExtends {
    public static void main(String[] args) {

    }

    public static Employee[] employees = {
            new CProgrammer("kolya1", 20.00),
            new CProgrammer("kolya2", 20.00),
            new JavaScriptProgrammer("kolya3", 20.00),
            new JavaScriptProgrammer("kolya4", 20.00),
            new JavaProgrammer("petr1", 30.00),
            new JavaProgrammer("petr2", 30.00),
            new JavaProgrammer("petr3", 30.00),
            new JavaProgrammer("petr4", 30.00),
            new JavaProgrammer("Masha1", 30),
            new JavaProgrammer("Masha2", 30),
            new Manager("Masha3", 30, 10),
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
