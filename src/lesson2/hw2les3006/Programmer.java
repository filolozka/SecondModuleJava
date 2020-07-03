package lesson2.hw2les3006;

import lesson2.Employee;

public class Programmer extends Employee {
    String language2;
    programmingLanguage language;

    public Programmer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Programmer: I'm coding");
    }

    public void codeReview() {
        //System.out.println("This " + language + " code is good"); //хотела бы автоматически подтягивать значение
        // переменной конкретного класса или переопределять этот метод с использованием переменной, но не понимаю, как это сделать
        System.out.println("This code is good");
    }

    public void codeReview(String language2) {
        System.out.println("This "+ language2 +" code is good");
    }
}
