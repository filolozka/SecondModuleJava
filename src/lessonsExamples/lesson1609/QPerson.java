package lessonsExamples.lesson1609;

import java.util.Objects;

public class QPerson {
    private String name;
    private int age;
    private int hashCode = 0;

    public QPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QPerson qPerson = (QPerson) o;
        return age == qPerson.age &&
                Objects.equals(name, qPerson.name);
    }

    @Override
    public int hashCode() {
        if(hashCode == 0){
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result * age;
            hashCode = result;
        }
        return hashCode;
    }

    @Override
    public String toString() {
        return "QPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
