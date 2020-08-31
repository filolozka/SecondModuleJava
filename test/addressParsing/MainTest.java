package addressParsing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void listHandler_normal_returnStringList() {
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
                new AddressList("Munich, Friedrichstrasse, 5, 10415",
                        "Frankfurt, Mauerstrasse, 40, 10115",
                        "23455245@list.ru")
        ));

        persons.add(new PersonP(
                "Vasiliy Ivanov",
                new AddressList("piterpan45@list.ru",
                        "Dortmund, Mauerstrasse, 1, 19230")
        ));

        assertEquals("", new ListHandler(persons, new AtContainsPredicate()));
    }
}