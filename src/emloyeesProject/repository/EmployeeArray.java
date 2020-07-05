package emloyeesProject.repository;

import emloyeesProject.repository.entity.*;

public class EmployeeArray {
    private Employee[] employees;
    private String nameOfOrganization;

    public EmployeeArray(String name, Employee[] employees) {
        this.employees = employees;
        this.nameOfOrganization = name;
    }

    public Employee[] getEmployees() {  //пока не справилась с методом, который собирает массив с неизвестным количеством аргументов, еще подумаю
            return employees;
    }

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }

    public void payForEmployee(Employee employee) {
        employee.pay();
    }

    public void payAll() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
            payForEmployee(employee);
            System.out.println("-----");
        }
    }

    public void workAll() {
        for (Employee employee : employees) {
            employee.work();
            System.out.println("-----");
        }
    }

    public void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
            System.out.println("-----");
        }
    }

    public void codeReviewAll() {
        for (Employee coder : employees) {
            if (isProgrammer(coder)) {
                System.out.println(coder.getName());
                System.out.print(" ");
                coder.codeReview();
                System.out.println("-----");
            } else {
                System.out.println("This employee doesn't programmer and doesn't need a code review");
            }
        }
    }

    private boolean isProgrammer(Employee employee) {
        if (employee instanceof Programmer) { //
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Programmer cProgrammer = new CProgrammer("Kolya", 60.00);
        Programmer javaCoder = new JavaProgrammer("Paul", 100.00);
        Programmer jsCoder = new JavaScriptProgrammer("Petra", 70.00);
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

        EmployeeArray akelius = new EmployeeArray("Akelius", allEmployees);
        akelius.payAll();
    }
}
