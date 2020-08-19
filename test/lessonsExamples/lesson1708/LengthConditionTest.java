package lessonsExamples.lesson1708;

import lessonsExamples.lesson1708.arrayHandler.Condition;
import lessonsExamples.lesson1708.arrayHandler.conditions.LengthCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthConditionTest {
    @Test
    public void test_LengthMoreThanFour_true(){
        String s = "23456";
        Condition condition = new LengthCondition(4);
        assertTrue(condition.test(s));
    }

    @Test
    public void test_LengthLessThanFour_false(){
        String s = "234";
        Condition condition = new LengthCondition(3);
        assertFalse(condition.test(s));
    }

    @Test
    public void test_LengthFour_false(){
        String s = "2343";
        Condition condition = new LengthCondition(4);
        assertFalse(condition.test(s));
    }

    @Test
    public void test_EmptyString_false(){
        String s = "";
        Condition condition = new LengthCondition(4);
        assertFalse(condition.test(s));
    }

    @Test
    public void test_NullString_false(){
        String s = null;
        Condition condition = new LengthCondition(4);
        assertFalse(condition.test(s));
    }

    @Test
    public void test_LengthMoreThanZero_true(){
        Condition condition = new LengthCondition(0);
        boolean res = (condition.test("1") == true) &&
                (condition.test("123") == true) &&
                (condition.test("") == false) &&
                (condition.test(null) == false);

        assertTrue(res);
    }
}