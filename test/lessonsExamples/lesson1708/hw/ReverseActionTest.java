package lessonsExamples.lesson1708.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseActionTest {
    @Test
    public void reverseActionTest_withString(){
        String temp = "qwer";
        int length = 1;
        ReverseAction reverseAction = new ReverseAction();
        assertEquals("rewq", reverseAction.doAction(temp, length));
    }

    @Test
    public void reverseActionTest_withNull(){
        String temp = null;
        int length = 1;
        ReverseAction reverseAction = new ReverseAction();
        assertNull(reverseAction.doAction(temp, length));
    }

    @Test
    public void reverseActionTest_withEmptyString(){
        String temp = "";
        int length = 1;
        ReverseAction reverseAction = new ReverseAction();
        assertEquals("", reverseAction.doAction(temp, length));
    }
}