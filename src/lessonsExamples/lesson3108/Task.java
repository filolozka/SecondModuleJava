package lessonsExamples.lesson3108;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {

        Person123 person123 = new Person123("Ivan", "Michajlov");
        person123.addAddress(new PersonAddress("Berlin, Mainstrasse, 123", "post"));
        person123.addAddress(new PersonAddress("123@mail.ru", "email"));
        person123.addAddress(new PersonAddress("13244524t", "billing"));

        Person123 person1231 = new Person123("Vasya", "Pupkin");
        person1231.addAddress(new PersonAddress("Berlin, Mainstrasse, 123", "post"));
        person1231.addAddress(new PersonAddress("123@mail.ru", "email"));
        person1231.addAddress(new PersonAddress("13244524t", "billing"));

        Person123 person12312 = new Person123("Lena", "Pushkina");
        person12312.addAddress(new PersonAddress("Berlin, Mainstrasse, 123", "post"));
        person12312.addAddress(new PersonAddress("123@mail.ru", "email"));
        person12312.addAddress(new PersonAddress("13244524t", "billing"));

        List<Person123> people = new ArrayList<>();
        people.add(person123);
        people.add(person1231);
        people.add(person12312);

        System.out.println(PersonListHandler.personListHandler(people));
    }
}
