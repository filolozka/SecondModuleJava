package streamApiTasks;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Lukinskaya", 1);
        Address address2 = new Address("Tortstrasse", 212);
        Address address3 = new Address("Lenina", 5);
        Address address4 = new Address("Lenina", 50);

        List<Person> personList = Arrays.asList(
                new Person("Vasya", 16, address1),
                new Person("Petya", 26, address2),
                new Person("Masha", 40, address3),
                new Person("Elisabeth", 26, address2),
                new Person("Paul", 40, address1),
                new Person("Lena", 10, address4));

        List<String> names = Arrays.asList("Barbara", "John", "Barbara", "Svetlana", "Ivan", "Paul", "John", "Boris");
        List<Account> accounts = Arrays.asList(
                new Account("DE89 3704 0044 0532 0130 00", new Person("p1")),
                new Account("DE89 3354 0044 0532 3430 55", new Person("p2")),
                new Account("DE89 1345 0044 0532 5160 00", new Person("p3")));

        String sentence = "They come across gatekeepers who say that to become a Data Scientist one needs to be a talented " +
                "programmer, an expert in mathematics, a master in applied statistics, and very skillful in using pandas, " +
                "NumPy, and other python libraries.";

        System.out.println("1. Get address list of persons who are older then 17 years old");
        System.out.println(Tasks.task1(personList));
        System.out.println("-----------------------------------------");

        System.out.println("2. Get names list without duplicate");
        System.out.println(Tasks.task2(names));
        System.out.println("-----------------------------------------");

        System.out.println("3. Get map from the ages and lists of same age people");
        System.out.println(Tasks.task3(personList));
        System.out.println("-----------------------------------------");

        System.out.println("4. Get map of person and his banking accounts list");
        System.out.println(Tasks.task4(accounts));
        System.out.println("-----------------------------------------");


        System.out.println("5. Get ibans with * from accounts list");
        System.out.println(Tasks.task5(accounts));
        System.out.println("-----------------------------------------");

        System.out.println("6. Get number of words stared with " + "b" + " from sentence");
        System.out.println("Number of words: " + Tasks.task6(sentence, "b"));
        System.out.println("-----------------------------------------");

        System.out.println("7. Check is the string is Integer:");
        System.out.println("Number of words: " + Tasks.isTheStringIsInteger("430"));
        System.out.println("-----------------------------------------");

        //System.out.println("8-9. Get secure IBANs from the list of Person");
        //System.out.println("IBANs are: ");
        //System.out.println("-----------------------------------------");

        System.out.println("10. Get total age of all people who older 17");
        System.out.println("Total age: " + Tasks.getTotalAge(personList));
        System.out.println("-----------------------------------------");

    }
}
