package addressParsing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Given a List. Every Person has a list of Address of various type (ex. Delivery address, e-mail, billing address…).
        // Write the program that create and displays the list of String [e-mail name]

        List<PersonP1> persons = new ArrayList<>();
        persons.add(new PersonP1(
                "Boris Johnson",
                new AddressesList(
                        "Berlin, Friedrichstrasse, 5, 10415",
                        "Berlin, Mauerstrasse, 40, 10115",
                        "qwe@list.ru")
        ));
        persons.add(new PersonP1(
                "Elena Carter",
                new AddressesList("Munich, Friedrichstrasse, 5, 10415", "Frankfurt, Mauerstrasse, 40, 10115", "piterpan45@list.ru")
        ));

        persons.add(new PersonP1(
                "Vasiliy Ivanov",
                new AddressesList("piterpan45@list.ru", "Dortmund, Mauerstrasse, 1, 19230")
        ));

        ListHandler test = new ListHandler(persons, new AtContainsPredicate());
        test.toHandTheListWithEmails();
        System.out.print(test.toString());
    }
}
