package lessonsExamples.lesson2509.hwCollections;

//Дан список имен, где некоторые имена повторяются. Написать функцию,
//которая по имени вернет количество вхождений этого имени в список.

import java.util.*;

public class MapTask4 {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>(Arrays.asList(
                "Luke", "Mary", "Kate", "Ivan", "Mark", "Luke", "Mary", "Lisa", "Mary", "Luke"));

       System.out.println(createTheMap(listOfNames));
       System.out.println(countOfRepeats(listOfNames, "Mary"));
    }

    public static int countOfRepeats(List<String> names, String name) {
        if (names == null || name == null) return 0;
        Map<String, Integer> mapForCount = createTheMap(names);
        Integer counter = mapForCount.get(name);
        return counter;
    }


    private static Map<String, Integer> createTheMap(List<String> names) {
        Integer counter = 0;
        Map<String, Integer> mapForCount = new HashMap<>();
        for (String str : names) {
            counter = mapForCount.get(str);
            mapForCount.put(str, (counter == null) ? 1 : counter + 1);
        }

        return mapForCount;
    }
}
