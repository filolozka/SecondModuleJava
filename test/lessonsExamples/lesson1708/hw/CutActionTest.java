package lessonsExamples.lesson1708.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CutActionTest {
    @Test
    public void cutActionTest_withString(){
        String temp = "qwertrerr";
        int length = 4;
        CutAction cutAction = new CutAction();
        assertEquals("qwer", cutAction.doAction(temp, length));
    }

    @Test
    public void reverseActionTest_withNull(){
        String temp = null;
        int length = 1;
        CutAction cutAction = new CutAction();
        assertNull(cutAction.doAction(temp, length));
    }

    @Test
    public void reverseActionTest_withEmptyString(){
        String temp = "";
        int length = 1;
        CutAction cutAction = new CutAction();
        assertEquals(null, cutAction.doAction(temp, length));
    }
}