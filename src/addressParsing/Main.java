package addressParsing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        //Given a List. Every Person has a list of Address of various type (ex. Delivery address, e-mail, billing address…).
        // Write the program that create and displays the list of String [e-mail name]

        List<PersonP> persons = new ArrayList<>();
        persons.add(new PersonP(
                "Boris Johnson",
                new AddressList(
                        "Berlin, Friedrichstrasse, 5, 10415",
                        "Berlin, Mauerstrasse, 40, 10115",
                        "qwe@list.ru")
        ));
        persons.add(new PersonP(
                "Elena Carter",
                new AddressList("Munich, Friedrichstrasse, 5, 10415", "Frankfurt, Mauerstrasse, 40, 10115", "piterpan45@list.ru")
        ));

        persons.add(new PersonP(
                "Vasiliy Ivanov",
                new AddressList("piterpan45@list.ru", "Dortmund, Mauerstrasse, 1, 19230")
        ));

        ListHandler test = new ListHandler(persons, new AtContainsPredicate());
        test.toHandTheListWithEmails();
        System.out.print(test.toString());
    }
}
