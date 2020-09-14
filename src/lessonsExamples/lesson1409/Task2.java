package lessonsExamples.lesson1409;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        //список строк -> получить Map, в котором будут пары соответствия имя + количество раз, которое встречалось в списке

        List<String> listOfString2 = new ArrayList<>();
        listOfString2.add("Olga");
        listOfString2.add("Vadim");
        listOfString2.add("Olga");
        listOfString2.add("Sergey");
        listOfString2.add("Vasya");
        listOfString2.add("Petya");
        listOfString2.add("Vasya");
        listOfString2.add("Vasya");

        System.out.println(getMapOfStrings(listOfString2).toString());
    }

    public static Map<String, Integer> getMapOfStrings(List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        if (list == null) return result;
        for (String string : list) {
            if (result.containsKey(string)) {
//                Integer i = result.get(string); //value от string из Map
//                i++;
                result.put(string, result.get(string) + 1);
            }
            else {
                result.put(string, 1);
            }
        }
        return result;
    }
}
