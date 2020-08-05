package lessonsExamples.lesson0508;

import lessonsExamples.lesson11.Person;

import java.util.Arrays;

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
                new Person1("Nicol", 20),
                new Person1("Paul", 15),
                new Person1("Nicol", 18),
                new Person1("Jane", 35),
                new Person1("Jane", 30),
        };

        System.out.println(people[0].compareTo(people[2]));
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));





        int[] test = {34, 24, 6, 2, 454, 35, 2};
        for (int i = 0; i < test.length - 1; i++) {
            int temp = 0;
            if (test[i] > test[i + 1]) {
                temp = test[i];
                test[i] = test[i + 1];
                test[i + 1] = temp;

            }
            //System.out.println(Arrays.toString(test));
            //if ()
            //дописать
        }
    }
}

