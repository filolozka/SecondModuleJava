package lessonsExamples.lesson3108;

import java.util.ArrayList;
import java.util.List;

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
        this.firstName = firstName;
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
        List<PersonAddress> res = new ArrayList<>();
        for (PersonAddress address: addresses) {
            if (address.getType().equals(type)){
                res.add(address);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return firstName + ' ' + secondName + " : {" + addresses + '}';
    }
}
