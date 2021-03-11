package lessonsExamples.lesson2509.hwCollections;

import java.util.HashMap;
import java.util.Map;

public class MapTask1 {
    //Дана Map<String, String> map, написать функцию, которая вернет Мап, такую,если в есходной map есть ключ ‘a’ и ‘b’,
    // то нужно создать новый ключ ‘ab’ ссуммой значений от ключей a и b.
    // Примеры: mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
    // mapAB({"a": "Hi"}) → {"a": "Hi"}
    // mapAB({"b": "There"}) → {"b": "There"}

    public static void main(String[] args) {

    }

    public static Map<String, String> getMapAB(Map<String, String> map){
        Map<String, String> mapAB = new HashMap<>();
        for (String key: map.keySet()) {
            if (map.containsKey("a") && map.containsKey("b")){
                //map.put("ab", )
            }
        }

        return null;
    }


}
