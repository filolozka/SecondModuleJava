package addressParsing;

import java.util.ArrayList;

public class PersonP1 {
    private AddressesList addresses;
    private ArrayList<String> addresses2;
    private String name;

    public PersonP1(String name, AddressesList addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public AddressesList getAddresses() {


        return addresses;
    }

    public String getName() {
        return name;
    }

        @Override
    public String toString() {
        return "PersonP{" +
                "addresses=" + addresses +
                ", name='" + name + '\'' +
                '}';
    }
}
