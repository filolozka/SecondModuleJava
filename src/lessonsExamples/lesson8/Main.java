package lessonsExamples.lesson8;

public class Main {
    public static void main(String[] args) {
        Person first = new Person("vasya", 21);
        Person second = new Person("masha", 20);

        System.out.println(first.getAge() > second.getAge());
        System.out.println(first.compareTo(second));
        System.out.println(PersonComparatorByAge.compare(second, second));
    }
}
