package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

public class Person {
    //task1
    private String name;
    private String surname;
    private Address address;

    public Person(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person {" + name + ' ' + surname + ", address=" + address + '}';
    }
}
