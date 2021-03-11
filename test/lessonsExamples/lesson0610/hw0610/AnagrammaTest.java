package lessonsExamples.lesson0610.hw0610;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnagrammaTest {
    private List<String> dictionaryForTest = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "nana", "navi");
    private Anagramma anagramma;

    @BeforeEach
    public void setUp(){
        anagramma = new Anagramma(dictionaryForTest);
    }

    @Test
    void getAnagrams_string_list() {
        List<String> listOfAnagrams = Arrays.asList("anna", "naan", "nana");
        assertEquals(listOfAnagrams, anagramma.getAnagrams("anna"));
    }

    @Test
    void getAnagrams_stringDontInList_emptyList() {
        List<String> listOfAnagrams = Arrays.asList();
        assertEquals(listOfAnagrams, anagramma.getAnagrams("vasya"));
    }
}