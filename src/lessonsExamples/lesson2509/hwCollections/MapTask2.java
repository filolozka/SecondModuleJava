package lessonsExamples.lesson2509.hwCollections;

//Дан массив букв, вернуть мапу Map<String, Boolean> где каждая строка
//является ключем, а значением true, если строка в массиве больше одного раза
//и false, если только один раз.

import java.util.HashMap;
import java.util.Map;

public class MapTask2 {
    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "a", "c", "b"};
        System.out.println(wordMultiple(array));
    }

    public static Map<String, Boolean> wordMultiple(String[] array) {
        Map<String, Boolean> map = new HashMap<>();
        if (array == null) return map;
        for (String s : array) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }
        return map;
    }
}
