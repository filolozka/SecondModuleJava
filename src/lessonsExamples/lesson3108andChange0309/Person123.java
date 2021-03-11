package lessonsExamples.lesson3108andChange0309;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person123 {
    private String firstName;
    private String secondName;
    private List<PersonAddress> addresses;

    public Person123(String firstName, String secondName, List<PersonAddress> addresses) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.addresses = addresses;
    }

    public Person123(String firstName, String secondName) {
            this.firstName = Objects.requireNonNull(firstName);
            this.secondName = secondName;
    }

    public void addAddress(PersonAddress address){
        if (address != null) {
            if (addresses == null){
                addresses = new ArrayList<>();
            }
            addresses.add(address);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;

    }

    public List<PersonAddress> getAddresses() {
        return new ArrayList<>(addresses);
    }

    public List<PersonAddress> getAddresses(String type) {
        if ((type.equals("email"))||(type.equals("post"))||(type.equals("billing"))){
            return getAddresses(AddressType.valueOf(type.toUpperCase()));
        }
        return new ArrayList<>();
    }

    public List<PersonAddress> getAddresses(AddressType type){
        List<PersonAddress> res = new ArrayList<>();
        for (PersonAddress address: addresses) {
            if (address.getType().equals(type.name().toLowerCase())){
                res.add(address);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return firstName + ' ' + secondName + " : {" + addresses + '}';
    }
}
