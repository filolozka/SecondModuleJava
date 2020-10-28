package streamApiTasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
                new Person("Lena", 10, address4));

        List<String> names = Arrays.asList("Barbara", "John", "Barbara", "Svetlana", "Ivan", "Paul", "John", "Boris");
        List<Account> accounts = Arrays.asList(
                new Account("DE89 3704 0044 0532 0130 00"),
                new Account("DE89 3354 0044 0532 3430 55"),
                new Account("DE89 1345 0044 0532 5160 00"));

        String sentence = "They come across gatekeepers who say that to become a Data Scientist one needs to be a talented " +
                "programmer, an expert in mathematics, a master in applied statistics, and very skillful in using pandas, " +
                "NumPy, and other python libraries.";

        System.out.println("1. Get address list of persons who are older then 17 years old");
        System.out.println(Tasks.task1(personList));
        System.out.println("-----------------------------------------");

        System.out.println("2. Get names list without duplicate");
        System.out.println(Tasks.task2(names));
        System.out.println("-----------------------------------------");

        System.out.println("5. Get ibans with * from accounts list");
        System.out.println(Tasks.task5(accounts));
        System.out.println("-----------------------------------------");

        System.out.println("6. Get number of words stared with " + "b" + " from sentence " + sentence);
        System.out.println("Number of words: " + Tasks.task6(sentence, "b"));
        System.out.println("-----------------------------------------");

        System.out.println("7. Get number of words stared with " + "b" + " from sentence " + sentence);
        System.out.println("Number of words: " + Tasks.task6(sentence, "b"));
        System.out.println("-----------------------------------------");
    }
}
