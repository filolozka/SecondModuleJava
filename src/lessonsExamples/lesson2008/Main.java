package lessonsExamples.lesson2008;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<PersonLinked> list = new LinkedList<>(); //лист - интерфейс, а линкедлист - его реализация
        list.add(new PersonLinked("asdf"));


        PersonLinkedList list1 = new PersonLinkedList();
        list1.add(new PersonLinked("Person1"));
        list1.add(new PersonLinked("Person2"));
        list1.add(new PersonLinked("Person3"));
        list1.add(new PersonLinked("Person6"));
        list1.add(new PersonLinked("Person5"));
        System.out.println(list1);
        list1.remove();
        list1.remove();
        System.out.println(list1);
        list1.add(new PersonLinked("Petya"));
        System.out.println("list before deleting: " + list1);
        PersonLinked p = new PersonLinked("Person4");
        System.out.println(list1.findFromPerson(p));
        System.out.println("-----------");
        list1.removeFromIndex(2);
        System.out.println(list1);
    }
}
