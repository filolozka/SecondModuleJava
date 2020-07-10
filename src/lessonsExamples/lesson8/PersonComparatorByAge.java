package lessonsExamples.lesson8;

public class PersonComparatorByAge {
    static int compare(Person p, Person p2) {
        //если инт вернул положительный, то больше, если 0, то равно, если отрицательный - второй параметр сравнения больше первого
        return p.getAge() - p2.getAge();
    }
}
