package lessonsExamples.lesson0109;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FunctionToStringTest {

    @Test
    public void apply_palindromeAndNoPalindromeList_palindromeList(){
        List<String> listIn = new ArrayList<>();
        listIn.add("qwertytrewq");
        listIn.add("asdfghgfdsa");
        listIn.add("dfvsdfgbsfgbfgb");
        listIn.add("sdfgbsdfgbsfgwq");

        List<String> listOut = new ArrayList<>();
        listOut.add("qwertytrewq");
        listOut.add("asdfghgfdsa");
        FunctionToString function = new FunctionToString();

        assertEquals(listOut, function.apply(listIn, new PredicatePalindrome()));
    }

    @Test
    public void apply_palindromeAndNoPalindromeList_emptyList(){
        List<String> listIn = new ArrayList<>();
        listIn.add("dafvsdfvdsf");
        listIn.add("adfvsdfsdfgbsdgb");
        listIn.add("dfvsdfgbsfgbfgb");
        listIn.add("sdfgbsdfgbsfgwq");

        List<String> listOut = new ArrayList<>();
        FunctionToString function = new FunctionToString();

        assertEquals(listOut, function.apply(listIn, new PredicatePalindrome()));
    }

    @Test
    public void apply_nullList_emptyList(){
        FunctionToString function = new FunctionToString();
        List<String> str1 = new ArrayList<>();
        assertEquals(function.apply(null, new PredicatePalindrome()), str1);
    }

    @Test
    public void apply_emptyList_emptyList(){
        List<String> str = new ArrayList<>();
        FunctionToString function = new FunctionToString();
        List<String> str1 = new ArrayList<>();
        assertEquals(function.apply(str, new PredicatePalindrome()), str1);
    }
}