package lessonsExamples.lesson2608;


import org.junit.jupiter.api.Test;

import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


class EvenOperatorTest {

    @Test
    public void apply_string_evenCharsString() {
        String str = "qwerty"; //по порядку
        UnaryOperator<String> operator = new EvenOperator();
        assertEquals("wry", operator.apply(str));
    }

    @Test
    public void apply_null_null() {
        UnaryOperator<String> operator = new EvenOperator();
        assertNull(operator.apply(null));
    }

    @Test
    public void apply_emptyString_emptyString() {
        UnaryOperator<String> operator = new EvenOperator();
        assertEquals("", operator.apply(""));
    }

    @Test
    public void apply_oneCharString_String() {
        UnaryOperator<String> operator = new EvenOperator();
        assertEquals("", operator.apply("e"));
    }
}