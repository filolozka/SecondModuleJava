package lessonsExamples.lesson1708;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseConditionSecondTest {
    @Test
    public void test_LengthMoreThanFour_true(){
        String s = "23456";
        Condition condition = new ReverseCondition();
        assertTrue(condition.test(s));
    }

    @Test
    public void test_LengthLessThanFour_false(){
        String s = "234";
        Condition condition = new ReverseCondition();
        assertFalse(condition.test(s));
    }

    @Test
    public void test_LengthFour_false(){
        String s = "2343";
        Condition condition = new ReverseCondition();
        assertFalse(condition.test(s));
    }

    @Test
    public void test_EmptyString_false(){
        String s = "";
        Condition condition = new ReverseCondition();
        assertFalse(condition.test(s));
    }

    @Test
    public void test_NullString_false(){
        String s = null;
        Condition condition = new ReverseCondition();
        assertFalse(condition.test(s));
    }
}