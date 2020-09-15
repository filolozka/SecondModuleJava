package addressParsing.secondTry;

import java.util.ArrayList;
import java.util.List;

public class AddressListHandler {
    private ArrayList<PersonP2> persons;
    private ArrayList<String> listNamesWithAddresses;

    public AddressListHandler(ArrayList<PersonP2> persons) {
        this.persons = persons;
    }

    public List<String> listHandler(AddressesTypes type) {
        listNamesWithAddresses = new ArrayList<>();
        String temp = "";
        if (persons != null) {
            for (PersonP2 person : persons) {
                if (person.getAddresses(type) != null) {
                    temp = person.getName() + " " + person.getAddresses(type);
                    listNamesWithAddresses.add(temp);
                }
            }
        }
        return listNamesWithAddresses;
    }
}
