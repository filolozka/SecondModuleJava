package lessonsExamples.lesson0508;

import java.util.Comparator;

public class PersonComparatorByAge implements Comparator<Person1> {

    @Override
    public int compare(Person1 o1, Person1 o2) {
        return o1.getAge() - o2.getAge();  //операция соответствует нашему контракту: если число положительное, то 01 больше, если 02 - отрицательное, если равны - ноль.
    }
}
