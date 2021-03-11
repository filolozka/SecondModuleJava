package lessonsExamples.lesson2408;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class lesson2408 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add(0, "str4");
        list.add("str5");
        list.add("str6");
        list.add("str7");
        list.add("str8");

        System.out.println(list);
        if (list.size() > 7) {
            System.out.println(list.get(7));
        }

        System.out.println("-------FOR------");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ' ');
        }
        System.out.println("");
        System.out.println("------FOR-EACH-------");
        for (String s : list) {
            System.out.print(s + ' ');
        }

        System.out.println("--------------------");
        list.remove(0);
        System.out.println(list);

        System.out.println("SORTING");
        list.sort(new StringComparator());
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(10);
        list2.add("hey");
        list2.add("hoy");
        list2.add("hi");
        list2.add("hello");
        list2.add("hallo");
        list2.remove(2);
        System.out.println(list2.size());
        list2.trimToSize();
        System.out.println(list2.indexOf("hoy"));


        List<Person24> people = new ArrayList<>();
        people.add(new Person24("Jack1"));
        people.add(new Person24("Jack2"));
        people.add(new Person24("Jack3"));

        Person24 person24 = new Person24("Jack2");

    }
}
