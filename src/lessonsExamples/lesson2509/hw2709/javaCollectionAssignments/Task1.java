package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    //Есть два класса: Address с полями улица и номер дома и Person с полями имя и
    //Address. Нужно по списку persons возвращать список их адресов

    public static void main(String[] args) {
        Address address1 = new Address("Lenina", "3");
        Address address2 = new Address("Mauerstrasse", "134");
        Address address3 = new Address("Pariska", "12");
        Address address4 = new Address("Obecna", "254");
        Person person1 = new Person("Vasya", "Ivanov", address1);
        Person person2 = new Person("Irka", "Stein", address2);
        Person person3 = new Person("Yan", "Smith", address3);
        Person person4 = new Person("Petra", "Vrtalova", address4);
        List<Person> people = Arrays.asList(person1, person2, person3, person4);
        System.out.println(getAddresses(people));
    }

    public static List<Address> getAddresses(List<Person> persons) {
        List<Address> addresses = new ArrayList<>();
        if (persons == null) return addresses;
        for (Person person : persons) {
            addresses.add(person.getAddress());
        }
        return addresses;
    }
}
