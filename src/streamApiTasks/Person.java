package streamApiTasks;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private Address address;
    private List<Account> bankAccounts;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, List<Account> bankAccounts) {
        this.name = name;
        this.bankAccounts = bankAccounts;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public List<Account> getBankAccounts() {
        return bankAccounts;
    }
}