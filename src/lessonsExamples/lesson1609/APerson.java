package lessonsExamples.lesson1609;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class APerson {
    private List<Address> addresses;
    private String name;

    public APerson(List<Address> addresses, String name) {
        this.addresses = addresses;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void putNewAddresses(List<Address> addresses) {
        List<Address> updatedList = new ArrayList<>(this.addresses);
        updatedList.addAll(addresses);
        this.addresses = updatedList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        APerson aPerson = (APerson) o;
        return Objects.equals(name, aPerson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + " " + addresses;
    }
}
