package lessonsExamples.hw08102020;

import java.util.function.Function;
import java.util.function.Supplier;

public class EmployeeSupplier {
    public static void main(String[] args) {
        //Return an employee salary using 1. Supplier, 2. Function.
        Employee emp = new Employee("Paul", "100000");

       Function<Employee, String> employeeSupplier = Employee :: getSalary;
       System.out.println("Try function employeeSupplier: " + employeeSupplier.apply(emp));

       //or something like this:
        Supplier<String> getSalary = emp :: getSalary;
        System.out.println("Try function employeeSupplier: " + getSalary.get());
    }
}
