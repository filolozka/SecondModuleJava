package tryHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Мурзик", 8);
        hashMap.put("Рыжик", 12);
        hashMap.put("Барсик", 5);

        Set<Map.Entry<String, Integer>> toSet = hashMap.entrySet();

        for (Map.Entry<String, Integer> me : toSet) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        int value = hashMap.get("Рыжик");
        hashMap.put("Рыжик", value + 3);
        System.out.println("У Рыжика стало " + hashMap.get("Рыжик"));
        System.out.println("Пока, Рыжик! " + hashMap.remove("Рыжик"));
        System.out.println("Пока, Мурзик! " + hashMap.remove( "Мурзик"));
        
        for (Map.Entry<String, Integer> me : toSet) {
            System.out.print(me.getKey() + ": " + me.getValue());
        }
        System.out.println();
        System.out.println("Сколько осталось котов: " + hashMap.size());
        System.out.println(hashMap.containsValue(5));
        System.out.println(hashMap.containsValue(12));
        System.out.println(hashMap.containsKey("Мурзик"));
    }
}
