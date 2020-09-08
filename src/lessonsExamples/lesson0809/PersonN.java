package lessonsExamples.lesson0809;

import java.util.Objects;

public class PersonN {
    String name;
    int age;

    public PersonN(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonN personN = (PersonN) o;
        return age == personN.age &&
                Objects.equals(name, personN.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
