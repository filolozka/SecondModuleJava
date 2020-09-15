package addressParsing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void listHandler_normal_returnStringList() {
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
                new AddressesList("Munich, Friedrichstrasse, 5, 10415",
                        "Frankfurt, Mauerstrasse, 40, 10115",
                        "23455245@list.ru")
        ));

        persons.add(new PersonP1(
                "Vasiliy Ivanov",
                new AddressesList("piterpan45@list.ru",
                        "Dortmund, Mauerstrasse, 1, 19230")
        ));

        assertEquals("", new ListHandler(persons, new AtContainsPredicate()));
    }
}