package lesson4;

import lesson2.DBMock;
import lesson2.Employee;
import lesson2.hw2les3006.CProgrammer;
import lesson2.hw2les3006.Manager;
import lesson3.hw3les0207.EmployeeArray;

public class Main {
    public static void main(String[] args) {
        EmployeeArray dep01 = new EmployeeArray("department it", DBMock.getEmployees());
        EmployeeArray dep02 = new EmployeeArray("department hr",
                new Employee[]{
                        new Manager("Sasha", 3.000, 1.000),
                        new CProgrammer("Oleg", 2.000)
                }
        );
        System.out.println("----------- department01" + dep01.getNameOfOrganization());
        dep01.printAll();
        System.out.println("------------department02" + dep02.getNameOfOrganization());
        dep02.printAll();

        EmployeeArray[] firm = {dep01, dep02};
        for (EmployeeArray arr: firm) {
            arr.workAll();
        }

        //Employee employee = new Employee("vasya", 30.0);
    }
}
