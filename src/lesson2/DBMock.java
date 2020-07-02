package lesson2;

import lesson2.hw2les3006.Programmer;

public class DBMock {
    public static Employee[] getEmployees() {
        Programmer programmer = new Programmer("Vasya", 2000.0);
        Programmer programmer2 = new Programmer("Katya", 3000.0);
        Tester tester = new Tester("Petya", 1000.0);
        Tester tester2 = new Tester("Matt", 1800.0);

        Employee[] employees = new Employee[]{ //вместо того, чтобы писать для каждого - можем создать единый массив и применить ко всем
                //это принцип IS A
                programmer,
                programmer2,
                tester,
                tester2,
                new Tester("Klara", 2000.0)
        };
        return employees;
    }
}
