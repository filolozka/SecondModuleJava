package lessonsExamples.lesson1609;

import java.util.*;

public class SecondTask {
    public static void main(String[] args) {
        APerson p1 = new APerson(Arrays.asList(new Address("Berlin, 123445", "post"), new Address("fdgb@dfb", "mail")), "Ivan");
        APerson p2 = new APerson(Arrays.asList(new Address("Berlin, 123446", "mail"), new Address("erfertg@bdfb", "mail")), "Lena");
        APerson p3 = new APerson(Arrays.asList(new Address("Berlin, 123447", "postcode"), new Address("ergweg@dfsfg", "mail")), "Maria");
        APerson p4 = new APerson(Arrays.asList(new Address("Berlin, 123448", "post"), new Address("fdf@sdffgfb", "mail")), "Marina");
        APerson p5 = new APerson(Arrays.asList(new Address("Moscow, 324484", "address1"), new Address("cerog@sdffgfb", "mail")), "Marina");

        List<APerson> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        System.out.println("1------");
        System.out.println(getPersonWithAddresses(people));
        System.out.println("2------");
        System.out.println(getPersonByNameWithAddresses(people));

    }

    public static Map<APerson, Set<Address>> getPersonWithAddresses(List<APerson> people){
        Map<APerson, Set<Address>> result = new HashMap<>();
        for (APerson p : people){
            Set<Address> addresses = new HashSet<>(p.getAddresses());
            result.put(p, addresses);
        }
        return result;
    }

    public static Map<String, Set<Address>> getPersonByNameWithAddresses(List<APerson> people){
        Map<String, Set<Address>> result = new HashMap<>();
        for (APerson p : people){
            Set<Address> addresses = new HashSet<>(p.getAddresses());
            result.put(p.getName(), addresses);
        }
        return result;
    }
}
