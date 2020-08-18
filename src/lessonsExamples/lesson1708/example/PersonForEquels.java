package lessonsExamples.lesson1708.example;

import java.util.Objects;

public class PersonForEquels {
    private String name;
    private Address address;

    public PersonForEquels(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public PersonForEquels(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonForEquels personForEquels = (PersonForEquels) o;
        return name.equals(personForEquels.name) &&
                address.equals(personForEquels.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "PersonForEquels{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
