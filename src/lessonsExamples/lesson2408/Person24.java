package lessonsExamples.lesson2408;

import java.util.Objects;

public class Person24 {
    private String name;

    public Person24(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person24{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person24 person24 = (Person24) o;
        return Objects.equals(name, person24.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
