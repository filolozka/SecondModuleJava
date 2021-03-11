package lessonsExamples.lesson0610;

import java.util.*;

public class Anagram {
    private static List<String> VOC = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "navi");

    public static List<String> getAnagram(String word) {
        List<String> res = new ArrayList<>();
        for (String w : VOC) {
            if (sortWord(w).equals(sortWord(word))) {
                res.add(w);
            }
        }
        return res;
    }

    public static Map<String, List<String>> buildMap(List<String> voc){
        Map<String, List<String>> result = new HashMap<>();
        for (String w : voc) {
            if (result.get(sortWord(w)) == null) {

            }
            else {

            }
        }
        return result;
    }

    public static String sortWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
