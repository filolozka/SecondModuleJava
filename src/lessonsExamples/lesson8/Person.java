package lessonsExamples.lesson8;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    int compareTo(Person p) { //неслучайно это int, а не булеан - нужны не 2, а 3 варианта
        //если инт вернул положительный, то больше, если 0, то равно, если отрицательный - второй параметр сравнения больше первого
        return this.getAge() - p.getAge();
    }

    public void setAge(int age) {
        this.age = age;
    }
}
