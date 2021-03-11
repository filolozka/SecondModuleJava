package lessonsExamples.lesson0610;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void getAnagram_test() {
        List<String> voc = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "navi");
        String word = "anna";
        List<String> expected = Arrays.asList("anna", "naan");
        List<String> actual = Anagram.getAnagram(word);
        assertEquals(expected, actual);
    }
}