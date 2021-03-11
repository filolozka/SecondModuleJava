package lessonsExamples.lesson0109;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredicatePalindromeTest {

    @Test
    public void test_isPalindrome_true(){
        String str = "1244321";
        String str1 = "5492171";
        PredicatePalindrome palindrome = new PredicatePalindrome();
        assertTrue(palindrome.test(str));
        assertFalse(palindrome.test(str1));
    }

    @Test
    public void test_isPalindrome_null(){

    }


}