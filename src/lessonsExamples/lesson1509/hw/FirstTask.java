package lessonsExamples.lesson1509.hw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstTask {
    public static void main(String[] args) {
        //Перебрать `Map<String, String>` и вывести на экран (не sout) построчно на экран

        Map<String, String> mapOfPets = new HashMap<String, String>();
        mapOfPets.put("Barbariska", "cat");
        mapOfPets.put("Barsik", "cat");
        mapOfPets.put("Lilu", "dog");
        mapOfPets.put("Alisa", "dog");
        mapOfPets.put("Matt", "turtle");

        System.out.println("First way to print HashMap:");
        printMap1(mapOfPets);
        System.out.println("--------------------------");
        System.out.println("Second way to print HashMap:");
        printMap2(mapOfPets);
        System.out.println("--------------------------");
        System.out.println("Print keys from HashMap:");
        printKeysFromMap(mapOfPets);
        System.out.println("--------------------------");
        System.out.println("Print values from HashMap:");
        printValuesFromMap(mapOfPets);
    }

    public static void printMap1(Map<String, String> map) {
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> pet : set) {
            System.out.println("My pet is " + pet);
        }
    }

    public static void printMap2(Map<String, String> map) {
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> pet : set) {
            System.out.println("Key is " + pet.getKey() + ", value is " + pet.getValue());
        }
    }

    public static void printKeysFromMap(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println("Key is " + key);
        }
    }

    public static void printValuesFromMap(Map<String, String> map) {
        for (String value : map.values()) {
            System.out.println("Key is " + value);
        }
    }
}
