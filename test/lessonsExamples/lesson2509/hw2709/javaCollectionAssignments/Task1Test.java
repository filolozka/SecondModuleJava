package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void getAddresses_personsList_addressesList() {
        Address address1 = new Address("Lenina", "3");
        Address address2 = new Address("Mauerstrasse", "134");
        Address address3 = new Address("Pariska", "12");
        Address address4 = new Address("Obecna", "254");
        Person person1 = new Person("Vasya", "Ivanov", address1);
        Person person2 = new Person("Irka", "Stein", address2);
        Person person3 = new Person("Yan", "Smith", address3);
        Person person4 = new Person("Petra", "Vrtalova", address4);
        List<Person> people = Arrays.asList(person1, person2, person3, person4);
        List<Address> addresses = Arrays.asList(address1, address2, address3, address4);

        assertEquals(addresses, Task1.getAddresses(people));
    }

    @Test
    void getAddresses_emptyPersonsList_emptyAddressesList() {
        List<Person> people = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        assertEquals(addresses, Task1.getAddresses(people));
    }

    @Test
    void getAddresses_null_emptyAddressesList() {
        List<Address> addresses = new ArrayList<>();
        assertEquals(addresses, Task1.getAddresses(null));
    }
}