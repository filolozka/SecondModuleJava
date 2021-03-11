package lessonsExamples.lesson0508;

import lessonsExamples.lesson11.Person;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Jack", "Nick", "John", "Anna"};

        for (int i = 0; i < names.length - 1; i++) {
            //System.out.println(i + " " + names[i].compareTo(names[i + 1]));
        }
        //можно отсортировать, но есть стандартные методы
        Arrays.sort(names);
        //System.out.println(Arrays.toString(names));

        Person1[] people = {
                new Person1("Nicola", 20),
                new Person1("Paublos", 15),
                new Person1("Nicol", 18),
                new Person1("Ann", 35),
                new Person1("Jane", 30),
        };

        //System.out.println(people[0].compareTo(people[2]));
        //Arrays.sort(people);

        //Comparator
        Comparator<Person1> typeOfSorting;
        int key = 3;
        switch (key) {
            case 1: //sort by age
                System.out.println("sort by age: "); //чтобы отсортировать в обратном порядке - поменять местами "слагаемые"
                typeOfSorting = new PersonComparatorByAge();
                Arrays.sort(people, typeOfSorting);
                break;

            case 2: //sort by name
                System.out.println("sort by name: ");
                typeOfSorting = new PersonComparatorByName();
                Arrays.sort(people, typeOfSorting);
                break;

            case 3: //sort by length of name
                System.out.println("sort by name length: ");
                typeOfSorting = new PersonComparatorByNameLength();
                Arrays.sort(people, typeOfSorting);
                break;

            case 4: //на будущее. синтаксический сахар
                Arrays.sort(people, (o1, o2) -> o1.getAge() - o2.getAge());
                break;

            default:
                System.out.println("sort by default: ");
                Arrays.sort(people);
        }
        System.out.println(Arrays.toString(people));


    }
}

