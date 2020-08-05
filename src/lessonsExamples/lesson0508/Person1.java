package lessonsExamples.lesson0508;

public class Person1 implements Comparable<Person1> {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person1 person) {
//        мой вариант. он рабочий:
//        if (!this.name.equals(person.name)) {
//            return this.name.compareTo(person.name);
//        } else {
//            return this.age - person.age;
//        }
//
        //еще вариант
        int nameComparing = this.name.compareTo(person.name); //используем переменную, чтобы дважды не гонять один метод
        if (nameComparing == 0){
            return (this.age - person.age);
        }
        else {
            return nameComparing;
        }

        // чуть короче
        //return (nameComparing == 0) ? (this.age - person.age) : nameComparing;
    }

//        if (this.age > person.age) { //у меня почему-то не сортирует по нему - надо проверить
//            return -1;
//        } else if (this.age < person.age) {
//            return 1;
//        }


    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
