package lessonsExamples.lesson1509;

import lessonsExamples.lesson1409.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //"Q", "w", "e"
        //"w", "e", "Q"

        List<String> list1 = Arrays.asList("w", "Q", "e", "w");
        List<String> list2 = Arrays.asList("Q", "e", "w", "w");
        System.out.println(list1.equals(list2));
        Set<String> hashSet1 = new HashSet<>();
        Set<String> hashSet2 = new HashSet<>();
        System.out.println(hashSet1.equals(hashSet2) && (list1.size() == list2.size()));

        Map<String, Integer> mapForCount = new HashMap<>();
        // {Q-1 w-2 e-1}
        // {Q-1 e-2 w-1}
        for (String st : list1) {
            Integer i = mapForCount.get(st);
            if (i == null) {
                mapForCount.put(st, 1);
            } else {
                mapForCount.put(st, ++i);
            }
        }
        System.out.println(mapForCount);

        Map<String, Integer> mapForCount2 = new HashMap<>();
        for (String st : list2) {
            Integer i = mapForCount2.get(st);
            if (i == null) {
                mapForCount2.put(st, 1);
            } else {
                mapForCount2.put(st, ++i);
            }
        }
        System.out.println(mapForCount2);
        System.out.println(mapForCount.equals(mapForCount2));

        for (String sr : list2) {
            Integer i2 = mapForCount.get(sr);
            if (i2 == null) {
                System.out.println("не равны");
            } else {
                i2--;
                if (i2.equals(0)) {
                    mapForCount.remove(sr);
                } else {
                    mapForCount.put(sr, i2);
                }
            }
        }
        System.out.println(mapForCount);

        Map<String, Boolean> map3 = new HashMap<>();
        for (String st : list1) {
            if (map3.containsKey(st)) {
                map3.put(st, true); //меняем значение ключа, если ключ уже встречался раньше
            } else {
                map3.put(st, false);
            }
        }
        System.out.println(map3);

        List<Person> listOne = Arrays.asList(
                new Person("Oleg"),
                new Person("Lora"),
                new Person("Oleg"),
                new Person("David"),
                new Person("Petya")
        );

        List<Person> listTwo = Arrays.asList(
                new Person("Oleg"),
                new Person("Anna"),
                new Person("Roman"),
                new Person("Lora"),
                new Person("Vasiliy")
        );
    }

    public static List<Person> getListOfDuplicated2(List<Person> list1, List<Person> list2) {
        List<Person> result = new ArrayList<>();
        if (list1 != null && list2 != null) {
            Set<Person> set1 = new HashSet<>(list1); //создали копию, убрали порядок и дубликаты
            set1.retainAll(list2); //убрали все элементы, которые не входят в list2
            result = new ArrayList<>(set1);

            return result;
        } else return result;
    }

    public static List<Person> getListOfDuplicated(List<Person> list1, List<Person> list2) {
        List<Person> result = new ArrayList<>();
        if (list1 != null && list2 != null) {
            Set<Person> set1 = new HashSet<>(list1);
            for (Person person : set1) {
                if (list2.contains(person)) {
                    result.add(person);
                }
            }
        }
        return result;
    }
}
