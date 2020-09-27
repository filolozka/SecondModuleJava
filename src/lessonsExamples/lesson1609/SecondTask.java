package lessonsExamples.lesson1609;

import java.util.*;

public class SecondTask {
    //1) - написать метод, чтобы он объединял адреса одинаковых имен
    //2) - переписать метод, где весь персон - ключ, лист адресов должен стать объединением адресов
    // (сначала объединять адреса, потом класть в сет) - видимо, 2 метода

    public static void main(String[] args) {
        APerson p1 = new APerson(Arrays.asList(new Address("Berlin, 123445", "post"), new Address("fdgb@dfb", "mail")), "Ivan");
        APerson p2 = new APerson(Arrays.asList(new Address("Berlin, 123446", "mail"), new Address("erfertg@bdfb", "mail")), "Lena");
        APerson p3 = new APerson(Arrays.asList(new Address("Berlin, 123447", "postcode"), new Address("ergweg@dfsfg", "mail")), "Anna");
        APerson p4 = new APerson(Arrays.asList(new Address("Berlin, 123448", "post"), new Address("fdf@sdffgfb", "mail")), "Marina");
        APerson p5 = new APerson(Arrays.asList(new Address("Moscow, 324484", "address1"), new Address("cerog@sdffgfb", "mail")), "Marina");

        List<APerson> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        System.out.println("1------");
        System.out.println(getPersonWithAddresses(people));
        System.out.println("2------");
        System.out.println(getPersonByNameWithAddresses(people));
        System.out.println("3------");
        System.out.println(getPersonWithUnitedAddressesByName(people));
        System.out.println("4------");
        System.out.println(getPersonWithUnitedAddressesByPerson(people));

    }

    public static Map<APerson, Set<Address>> getPersonWithAddresses(List<APerson> people) {
        Map<APerson, Set<Address>> result = new HashMap<>();
        for (APerson p : people) {
            Set<Address> addresses = new HashSet<>(p.getAddresses());
            result.put(p, addresses);
        }
        return result;
    }

    public static Map<String, Set<Address>> getPersonByNameWithAddresses(List<APerson> people) {
        Map<String, Set<Address>> result = new HashMap<>();
        for (APerson p : people) {
            Set<Address> addresses = new HashSet<>(p.getAddresses());
            result.put(p.getName(), addresses);
        }
        return result;
    }

    public static Map<String, Set<Address>> getPersonWithUnitedAddressesByName(List<APerson> people) {
        Map<String, Set<Address>> result = new HashMap<>();
        if (people == null) return result;
        for (APerson p : people) {
            Set<Address> addresses = new HashSet<>(p.getAddresses());
            if (result.containsKey(p.getName())) {
                result.get(p.getName()).addAll(p.getAddresses()); //смотрим, есть ли запись с таким именем. если есть - значит, надо туда добавить новые адреса
                //получаем значение по ключу через get() по ключу (имя). потом добавляем в этого персона еще адреса - он обновит из добавляемой коллекции
                //так как не допускаются дубли, это будут уникальные адреса
            } else {
                result.put(p.getName(), addresses);
            }
        }return result;
    }

    public static Map<APerson, Set<Address>> getPersonWithUnitedAddressesByPerson(List<APerson> people) {
        Map<APerson, Set<Address>> result = new HashMap<>();
        if (people == null) return result;
        for (APerson p : people) {
            Set<Address> addresses = new HashSet<>(p.getAddresses());
            if (result.containsKey(p)) {
                result.get(p).addAll(p.getAddresses());
            } else {
                result.put(p, addresses);
            }

        }return result;
    }
}
