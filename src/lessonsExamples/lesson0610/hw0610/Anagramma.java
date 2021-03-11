package lessonsExamples.lesson0610.hw0610;

//Анаграмма слова x - слово, по длине равное x и состоящее из таких же букв,
//что и x. Дан словарь, содержащий анаграммы, например {“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
//Написать функцию, которая по слову из словаря вернет все анаграммы этого слова, которые есть в словаре.

import java.util.*;

//Second decision by object orient, like it was on the lesson

public class Anagramma {
    public static List<String> DICTIONARY = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "nana", "navi");
    private Map<String, List<String>> dictionaryOfAnagrams;
    private List<String> listOfAnagrams;

    public Anagramma(List<String> voc) {
        if (voc != null) {
            this.dictionaryOfAnagrams = createMap(voc);
        }
    }

    public List<String> getAnagrams(String name) {
        listOfAnagrams = dictionaryOfAnagrams.get(sortCharsToAbc(name));
        if (listOfAnagrams == null){
            return new ArrayList<>();
        }
        return listOfAnagrams;
    }

    private Map<String, List<String>> createMap(List<String> voc) {
        dictionaryOfAnagrams = new HashMap<>();
        for (String string : voc) {
            String stringSortedToAbc = sortCharsToAbc(string);
            List<String> list = dictionaryOfAnagrams.get(stringSortedToAbc);
            if (list == null) {
                list = new ArrayList<>();
                list.add(string);
                dictionaryOfAnagrams.put(stringSortedToAbc, list);
            } else {
                list.add(string);
            }
        }
        return dictionaryOfAnagrams;
    }

    private String sortCharsToAbc(String name) {
        char[] charsFromString = name.toCharArray();
        Arrays.sort(charsFromString);
        return new String(charsFromString);
    }
}
