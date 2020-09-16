package lessonsExamples.lesson1509.hw;

import java.util.*;

public class SecondTask {
    //Даны `List<String>`, `Map<String, Integer>` -> если значения лист есть в мэп, добавить в исходный мэп новый объект:
    // ключ - сумма стрингов из листа и map, а значение - сумма integer из map

    public static Map<String, Integer> putNewListToMap(Map<String, Integer> mapOfStringAndInt,
                                                       List<String> listForChecking) {
        Map<String, Integer> result = new HashMap<>();

        if (listForChecking == null || listForChecking.size() == 0) {
            return mapOfStringAndInt;
        } else if (mapOfStringAndInt == null) {
            return result;
        }
        else {
            if (checkListWithMap(mapOfStringAndInt, listForChecking)) {
                result.putAll(mapOfStringAndInt);
                result.putAll(getSumKeysAndValues(mapOfStringAndInt, listForChecking));
                return result;
            }
            return mapOfStringAndInt;
        }
    }

    public static Map<String, Integer> getSumKeysAndValues(Map<String, Integer> mapOfStringAndInt,
                                                    List<String> listForChecking){
        Map<String, Integer> result = new HashMap<>();
        StringBuilder key = new StringBuilder();
        int value = 0;

        for (int i = 0; i < listForChecking.size(); i++) {
            key.append(listForChecking.get(i));
            value = mapOfStringAndInt.get(listForChecking.get(i)) + value;
        }

        result.put(key.toString(), value);
        return result;
    }

    public static boolean checkListWithMap(Map<String, Integer> mapOfStringAndInt, List<String> listForChecking){
        if (mapOfStringAndInt == null ^ listForChecking == null) return false;
        for (String key: mapOfStringAndInt.keySet()) {
            return listForChecking.contains(key);
        }
        return false;
    }
}
