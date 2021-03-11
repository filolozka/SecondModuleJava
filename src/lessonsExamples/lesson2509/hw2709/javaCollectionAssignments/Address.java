package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import java.util.Objects;

public class Address {
    //task1
    private String street;
    private String houseNumber;

    public Address(String street, String houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) &&
                Objects.equals(houseNumber, address.houseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, houseNumber);
    }

    @Override
    public String toString() {
        return "{" + street + ", " + houseNumber + "}";
    }
}
