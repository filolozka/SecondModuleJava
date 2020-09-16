package lessonsExamples.lesson1609;

import java.util.Objects;

public class Address {
    private String address;
    private String type;

    public Address(String address, String type) {
        this.address = address;
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address1 = (Address) o;
        return Objects.equals(address, address1.address) &&
                Objects.equals(type, address1.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, type);
    }

    @Override
    public String toString() {
        return "\n" + address +
                " " + type;
    }
}
