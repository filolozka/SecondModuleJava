package lessonsExamples;

import emloyeesProject.repository.entity.Employee;

public class Main {
    public Employee[] getEmployees(Employee... args) {
        int counter = 0;
        Employee[] employees;
        for (Employee employee : args) {
            counter++;
        }

        if (counter > 0) {
            employees = new Employee[counter];
            for (int i = 0; i < counter; i++) {
                //employees[i] = employee;
            }
            return employees;
        }
        return null;
    }
}
