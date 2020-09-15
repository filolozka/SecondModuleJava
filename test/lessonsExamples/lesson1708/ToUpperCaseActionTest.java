package lessonsExamples.lesson1708;

import lessonsExamples.lesson1708.arrayHandler.Action;
import lessonsExamples.lesson1708.arrayHandler.actions.ToUpperCaseAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToUpperCaseActionTest {
    @Test
    public void doAction_normalString_shouldBeUpperCase() {
        String str = "qwer.-32йцц";
        Action action = new ToUpperCaseAction();
        assertEquals("QWER.-32ЙЦЦ", action.doAction(str));
        //Assertions.assertEquals("4321", action.doAction(str)); - второй вариант
    }

    @Test
    public void doActionEmptyStringShouldReturnEmptyString() {
        String str = "";
        Action action = new ToUpperCaseAction();
        assertEquals("", action.doAction(str));
    }

    @Test
    public void doActionNullShouldReturnNull() {
        String str = null;
        Action action = new ToUpperCaseAction();
        assertNull(action.doAction(str));
    }
}