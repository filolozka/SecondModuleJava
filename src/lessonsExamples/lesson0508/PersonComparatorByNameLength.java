package lessonsExamples.lesson0508;

import java.util.Comparator;

public class PersonComparatorByNameLength implements Comparator<Person1> {

    @Override
    public int compare(Person1 o1, Person1 o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
