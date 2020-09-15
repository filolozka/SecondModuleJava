package lessonsExamples.lesson1708;

import lessonsExamples.lesson1708.arrayHandler.actions.TestAction;
import lessonsExamples.lesson1708.arrayHandler.StringArrayHandler;
import lessonsExamples.lesson1708.arrayHandler.conditions.TestCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayHandlerTest {
    /*
    можем проверять только то, что в этом методе (не action и не condition)
    - нормальный
    - пустой массив
    - null
    - пустой action
    - пустой condition
    - если в качестве аргументов null
     */

    @Test
    public void stringsHadler_ordinaryCase() {
        String[] strings = {"123", "qwerty", "123456", "13", "abc", ""};
        String[] expectedArr = {"test", "test", "test", "13", "test", ""};
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(strings,
                        new TestAction(),
                        new TestCondition());
        stringArrayHandler.stringsHadler();
        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());
    }

    @Test
    public void stringsHadler_nullAction_nothingChange() {
        String[] strings = {"123", "qwerty", "123456", "13", "abc", ""};
        String[] expectedArr = {"123", "qwerty", "123456", "13", "abc", ""};
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(strings,
                        null,
                        new TestCondition());
        stringArrayHandler.stringsHadler();
        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());
    }

    @Test
    public void stringsHadler_nullCondition_changeAllElements() {
        String[] strings = {"123", "qwerty", "123456", "13", "abc", ""};
        String[] expectedArr = {"test", "test", "test", "test", "test", "test"};
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(strings,
                        new TestAction(),
                        null);
        stringArrayHandler.stringsHadler();
        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());
    }

    @Test
    public void stringsHadler_nullArray_changeAllElements() {
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(null,
                        new TestAction(),
                        new TestCondition());
        stringArrayHandler.stringsHadler();
        assertNull(stringArrayHandler.getStrings());
    }
}