package lessonsExamples.lesson1609;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SecondTaskTest {

    @Test
    void getPersonWithUnitedAddressesByName_listWithDuplicate_listPerson() {
        APerson p1 = new APerson(Arrays.asList(new Address("Berlin, 123445", "post"), new Address("fdgb@dfb", "mail")), "Ivan");
        APerson p2 = new APerson(Arrays.asList(new Address("Berlin, 123446", "mail"), new Address("erfertg@bdfb", "mail")), "Lena");
        APerson p3 = new APerson(Arrays.asList(new Address("Berlin, 123447", "postcode"), new Address("ergweg@dfsfg", "mail")), "Anna");
        APerson p4 = new APerson(Arrays.asList(new Address("Berlin, 123448", "post"), new Address("fdf@sdffgfb", "mail")), "Marina");
        APerson p5 = new APerson(Arrays.asList(new Address("Moscow, 324484", "address1"), new Address("cerog@sdffgfb", "mail")), "Marina");
        APerson unitePerson = new APerson(Arrays.asList(new Address("Moscow, 324484", "address1"), new Address("cerog@sdffgfb", "mail"), new Address("Berlin, 123448", "post"), new Address("fdf@sdffgfb", "mail")), "Marina");

        List<APerson> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        Map<APerson, Set<Address>> result = new HashMap<>();
        result.put(p1, new HashSet<>(Arrays.asList(new Address("Berlin, 123445", "post"), new Address("fdgb@dfb", "mail"))));
        result.put(p2, new HashSet<>(Arrays.asList(new Address("Berlin, 123446", "mail"), new Address("erfertg@bdfb", "mail"))));
        result.put(p3, new HashSet<>(Arrays.asList(new Address("Berlin, 123447", "postcode"), new Address("ergweg@dfsfg", "mail"))));
        result.put(unitePerson, new HashSet<>(Arrays.asList(new Address("Moscow, 324484", "address1"), new Address("cerog@sdffgfb", "mail"), new Address("Berlin, 123448", "post"), new Address("fdf@sdffgfb", "mail"))));

        //assertEquals(result, SecondTask.getPersonWithUnitedAddressesByName(people));
        assertEquals(result, SecondTask.getPersonWithUnitedAddressesByPerson(people));
    }

    @Test
    void getPersonWithUnitedAddressesByName_listWithoutDuplicate_listPerson() {
        APerson p1 = new APerson(Arrays.asList(new Address("Berlin, 123445", "post"), new Address("fdgb@dfb", "mail")), "Ivan");
        APerson p2 = new APerson(Arrays.asList(new Address("Berlin, 123446", "mail"), new Address("erfertg@bdfb", "mail")), "Lena");
        APerson p3 = new APerson(Arrays.asList(new Address("Berlin, 123447", "postcode"), new Address("ergweg@dfsfg", "mail")), "Anna");
        APerson p4 = new APerson(Arrays.asList(new Address("Berlin, 123448", "post"), new Address("fdf@sdffgfb", "mail")), "Marina");

        List<APerson> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        Map<APerson, Set<Address>> result = new HashMap<>();
        result.put(p1, new HashSet<>(p1.getAddresses()));
        result.put(p2, new HashSet<>(p2.getAddresses()));
        result.put(p3, new HashSet<>(p3.getAddresses()));
        result.put(p4, new HashSet<>(p4.getAddresses()));

        //assertEquals(result, SecondTask.getPersonWithUnitedAddressesByName(people));
        assertEquals(result, SecondTask.getPersonWithUnitedAddressesByPerson(people));
    }

    @Test
    void uniteTheAddresses_emptyList_listPerson() {
        List<APerson> people = new ArrayList<>();
        Map<APerson, Set<Address>> result = new HashMap<>();

        //assertEquals(result, SecondTask.getPersonWithUnitedAddressesByName(people));
        assertEquals(result, SecondTask.getPersonWithUnitedAddressesByPerson(people));
    }

    @Test
    void uniteTheAddresses_null_listPerson() {
        Map<APerson, Set<Address>> result = new HashMap<>();
        //assertEquals(result, SecondTask.getPersonWithUnitedAddressesByName(null));
        assertEquals(result, SecondTask.getPersonWithUnitedAddressesByPerson(null));
    }
}