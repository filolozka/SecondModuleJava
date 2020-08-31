package addressParsing;

import java.util.ArrayList;

public class PersonP {
    private AddressList addresses;
    private ArrayList<String> addresses2;
    private String name;

    public PersonP(String name, AddressList addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public AddressList getAddresses() {
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
