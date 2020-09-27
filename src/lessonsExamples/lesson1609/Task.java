package lessonsExamples.lesson1609;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        Map<QPerson, String> map;
        map = new HashMap<>();

        QPerson p1 = new QPerson("Igor", 20);
        QPerson p2 = new QPerson("Lena", 18);
        QPerson p3 = new QPerson("Nick", 25);
        map.put(p1, p1.getName());
        map.put(p2, p2.getName());
        map.put(p3, p3.getName());
        System.out.println("p1 hashCode " + p1.hashCode());
        System.out.println("p2 hashCode " + p2.hashCode());
        System.out.println("p3 hashCode " + p3.hashCode());
        System.out.println(map.get(p1));
        p1.setAge(21);
        System.out.println(map);
        System.out.println("2. " + map.get(p1));
        System.out.println("p1 hashCode " + p1.hashCode());
        System.out.println("--------------------------");
        final Set<QPerson> people = map.keySet();
        for (QPerson person : people){
            System.out.println(person + " " + map.get(person));
        }
        System.out.println("--------------------");
        map.forEach((p, s) -> System.out.println(p + " " + s));
    }
}

