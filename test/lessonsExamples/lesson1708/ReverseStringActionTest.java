package lessonsExamples.lesson1708;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringActionTest {

    @Test
    public void doAction_goodString_reverseString() {
        String str = "1234";
        Action action = new ReverseStringAction();
        assertEquals("4321", action.doAction(str));
        //Assertions.assertEquals("4321", action.doAction(str)); - второй вариант
    }

    @Test
    public void doActionNullShouldReturnNull() {
        String str = "";
        Action action = new ReverseStringAction();
        assertEquals("", action.doAction(str));
    }

    @Test
    public void doActionEmptyStringShouldReturnEmptyString() {
        String str = null;
        Action action = new ReverseStringAction();
        assertNull(action.doAction(str));
    }

    @Test
    public void reverseConditionShouldReturnFalse(){
        String str = "hello";
        ReverseCondition condition = new ReverseCondition();
        assertEquals(false, condition.test(str));
    }

    @Test
    public void reverseConditionShouldReturnTrue(){
        String str = "hello1";
        ReverseCondition condition = new ReverseCondition();
        assertEquals(true, condition.test(str));
    }
}