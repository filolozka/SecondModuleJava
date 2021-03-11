package lessonsExamples.lesson0610.hw0610;

import java.util.*;

//First decision is by algorithmic way

public class Main {
    public static void main(String[] args) {
        List<String> dictionaryForTest = new ArrayList<>(Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "nana", "navi"));
        //System.out.println(giveMeAnagrams("ivan", dictionaryForTest));

        //test of the second decision:
        Anagramma test = new Anagramma(dictionaryForTest);
        System.out.println((test.getAnagrams("anna").toString()));
    }

    public static List<String> giveMeAnagrams (String name, List<String> dictionary){
        List<String> anagrams = new ArrayList<>();

        Map<String, List<String>> temp = new HashMap<>();

        for (String string : dictionary) {
            if (sortStringToAbc(string).equals(sortStringToAbc(name))){
                anagrams.add(string);
                temp.put(name, anagrams);
            }
        }
        return anagrams;
    }

    private static String sortStringToAbc(String string) {
        char[] nameOfChars = string.toCharArray();
        Arrays.sort(nameOfChars);
        return Arrays.toString(nameOfChars);
    }
}
