package lessonsExamples.lesson3;

import emloyeesProject.repository.entity.CProgrammer;
import emloyeesProject.repository.entity.Employee;
import emloyeesProject.repository.entity.JavaProgrammer;
import emloyeesProject.repository.entity.Programmer;

public class Main {
    public static void main(String[] args) {
        Employee emp = new JavaProgrammer("Katya", 20.0);
        Programmer pr = new CProgrammer("Ron", 30.0);

    }


}
