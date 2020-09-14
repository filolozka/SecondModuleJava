package lessonsExamples.lesson1409;

import java.util.*;

public class Task {
    //список строк -> получить новый список, в котором будут исключены все повторы строк
    //список из уникальных строк исходного списка

    public static void main(String[] args) {

        List<String> listOfString = new ArrayList<>();
        listOfString.add("Olga");
        listOfString.add("Vadim");
        listOfString.add("Olga");
        listOfString.add("Sergey");
        listOfString.add("Vasya");
        listOfString.add("Petya");
        listOfString.add("Vasya");

       // System.out.println(getUniqueString(listOfString).toString());

        List<Person> personList = Arrays.asList(
                new Person("Vasya"),
                new Person("Masha"),
                new Person("Vasya"),
                new Person("Kolya"),
                new Person("Kostya"),
                new Person("Kostya"),
                new Person("Valya"),
                new Person("Kostya")
        );

        System.out.println(getUniquePerson(personList).toString());
    }

    public static List<String> getUniqueString(List<String> list) {
        if (list == null) return new ArrayList<String>();
        List<String> newList = new ArrayList<>(new HashSet<String>(list)); //HashSet не гарантирует порядок элементов, поэтому тут может не сработать корректно equals()
        return newList;
    }

    public static List<Person> getUniquePerson(List<Person> list) {
        if (list == null) return new ArrayList<Person>();
        List<Person> newList = new ArrayList<>(new HashSet<Person>(list)); //Hashcode по умолчанию смотрит адрес памяти -> необходимо переопределять для объектов
        return newList;
    }
}
