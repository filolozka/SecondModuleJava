package lessonsExamples.lesson2.hw2les3006;

import emloyeesProject.repository.entity.*;

public class Main {

    public static void main(String[] args) {
        Programmer cProgrammer = new CProgrammer("Kolya", 60.00);
        Programmer javaCoder = new JavaProgrammer("Paul", 100.00);
        Programmer jsCoder = new JavaScriptProgrammer("Petra", 70.00);

        Programmer[] programmers = new Programmer[]{cProgrammer, javaCoder, jsCoder};

        Employee tester = new Tester("Valery", 50.00);
        Employee project = new LazyEmployee("Andrea", 90.00);
        Employee tester2 = new Tester("Sveta", 60.00);
        Employee product = new Tester("Jane", 75.00);
        Employee manager = new Manager("Vika", 150.00, 30.00);

        Employee[] allEmployees = new Employee[]{
                tester,
                tester2,
                product,
                project,
                cProgrammer,
                javaCoder,
                jsCoder,
                manager
        };

        System.out.println("Employees are: ");

        for (Employee employee : allEmployees) {
            System.out.println(employee.getName());
            employee.work();
            employee.pay();
            System.out.println("-----");
        }

        System.out.println("Programmers are: ");

        for (Programmer coder : programmers) {
            System.out.println(coder.getName());
            coder.work();
            coder.codeReview();
            System.out.println("-----");
        }
    }
}
