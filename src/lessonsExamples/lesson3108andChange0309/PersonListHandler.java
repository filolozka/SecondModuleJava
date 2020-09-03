package lessonsExamples.lesson3108andChange0309;

import java.util.ArrayList;
import java.util.List;

public class PersonListHandler {
    //private String type = "email"; второй вариант, как можно сделать код более универсальным

    public static List<String> personListHandler(List<Person123> people, String type) {
        List<String> list = new ArrayList<>();
        if (people != null){
            for (Person123 person : people) {
                List<PersonAddress> tempAddressList = person.getAddresses("email");
                String nameString = person.getFirstName() + " " + person.getSecondName();
                for (PersonAddress adr : tempAddressList){
                    list.add(new String(adr.getAddress() + " " + nameString));
                }
            }
        }
        return list;
    }

    public static List<String>personListHandler(List<Person123> people) {
        return personListHandler(people, "email");
    }
}

