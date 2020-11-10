package lessonsExamples.lesson2910.hw;

import java.util.function.Predicate;

public class Customer {
    private String name;
    private int age;
    private BankAccount account;

    public Customer(String name, int age, BankAccount account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public BankAccount getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Customer: " + name;
    }
}
