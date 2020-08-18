package lessonsExamples.lesson1708.example;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Berlin", "Invalidenstrasse");
        PersonForEquels p1 = new PersonForEquels("Jack", address1);
        PersonForEquels p2 = new PersonForEquels("Nick");
        PersonForEquels p3 = new PersonForEquels("Jack", new Address("Berlin", "Invalidenstrasse"));

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p1.equals(p3));//не определен критерий, поэтому всё равно false
    }
}
