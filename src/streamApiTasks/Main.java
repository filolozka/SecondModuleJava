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

        List<String> names = Arrays.asList("Barbara", "John", "Barbara", "Svetlana", "Ivan", "Paul", "John");
        List<Account> accounts = Arrays.asList(
                new Account("DE89 3704 0044 0532 0130 00"),
                new Account("DE89 3354 0044 0532 3430 55"),
                new Account("DE89 1345 0044 0532 5160 00"));

        System.out.println("Get address list of persons who are older then 17 years old");
        task1(personList);
        System.out.println("-----------------------------------------");

        System.out.println("Get names list without duplicate");
        task2(names);
        System.out.println("-----------------------------------------");

        System.out.println("Get ibans with * from accounts list");
        task5(accounts);
        System.out.println("-----------------------------------------");
    }

    public static void task1(List<Person> personList){
        //1. Нужно написать функцию, которая по списку persons вернет список адресов тех
        //людей, чей возраст больше 17 лет.
        List<Address> addressesPersonsOlder17Years = personList
            .stream()
            .filter(p -> p.age > 17)
            .map(person -> person.address)
            .collect(Collectors.toList());
        System.out.println(addressesPersonsOlder17Years);
    }

    public static void task2(List<String> names){
        //2. Есть список имен, нужно написать функцию, которая вернет список имен без дупликатов
        List<String> namesWithoutDuplicate = names
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(namesWithoutDuplicate);
    }

    public static void task3(List<Person> personList){
        //Есть список людей, нужно написать функцию, которая вернет мапу, где
        //ключом является возраст, а значением список людей этого возраста
//        Map<Integer, List<Person>> mapOfPersonInCurrentAge = personList
//                .stream()
//                .
//                //.allMatch(person -> person.age == )
//                .collect(Collectors.groupingBy(person -> person.age));
//                //.collect(Collectors.toMap());
    }

    public static void task4(){
        //нужно написать функцию, которая возвращает мапу, где значением является Person, а
        //значением - список его банковских счетов.
    }

    public static void task5(List<Account> accounts){
        //5. Написать функцию, которая для списка счетов, возвращает список IBANNs,
        //где в каждом IBAN символы после 3-го и до конца заменены звездочками.
        List<String> ibans = accounts
                .stream()
                .map(account -> account.iban.substring(0, 3) + "*******************")
                .collect(Collectors.toList());
        System.out.println(ibans);
    }

    public static void task6(List<String> sentence, String letter){
        //Написать функцию, которая принимает предложение, а возвращает
        //количество слов, начинающихся на заданную букву
      /*  Integer numberOfWords = sentence
                .stream()
                .filter(s -> s.startsWith(letter))
                .count();*/
    }
}
