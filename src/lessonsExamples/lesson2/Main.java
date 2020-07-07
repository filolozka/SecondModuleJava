package lessonsExamples.lesson2;

import emloyeesProject.repository.DBMock;
import emloyeesProject.repository.entity.Employee;

public class Main {
    public static void main(String[] args) {

        String[] bonusList = {"Vasya", "Klara", "Nick"};

        Employee[] employees = DBMock.getEmployees(); //типа обращение к базе данных

        for (Employee employee : employees) {
            if(inBonus(bonusList, employee.getName())){
                employee.pay(550);
            }
            else {
                employee.pay();
            }
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        for (Employee employee : employees) {
            employee.work();
        }
    }

    public static boolean inBonus(String[] bonusList, String name){
        for (String str: bonusList){
            if (str.equals(name)){
                return true;
            }
        }
        return false;
    }
}
