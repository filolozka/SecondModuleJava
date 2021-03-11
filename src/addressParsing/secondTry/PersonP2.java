package addressParsing.secondTry;

import java.util.ArrayList;

public class PersonP2 {
    private String name;
    private ArrayList<AddressPerson> addresses;

    public PersonP2(String name, ArrayList<AddressPerson> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public void addAddress(AddressPerson addressPerson){
        if (addressPerson != null && addresses != null){
            addresses.add(addressPerson);
        }
    }

    public ArrayList<AddressPerson> getAddresses(AddressesTypes type) {
        ArrayList<AddressPerson> copy = new ArrayList<>();
        for (AddressPerson address: addresses) {
            if (address.getType().equals(type)){
                copy.add(address);
            }
        }
        return copy;
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
