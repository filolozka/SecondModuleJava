package lessonsExamples.lesson1409;

import java.util.Stack;
import java.util.function.Predicate;

public class BracketsChecker implements Predicate<String> {
    private char[][] brackets = {
            {'(', ')'},
            {'[', ']'},
            {'{', '}'}
    };

    @Override
    public boolean test(String s) {
        if (s == null) return false;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.trim().toCharArray()) { //s.trim() обрезают кольцевые пробелы
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else {
                char oppositeCh = getOppositeBracket(ch);
            if ((oppositeCh != ' ') && ((stack.size() == 0)
                        || (!stack.pop().equals(oppositeCh)))) {
                    return false;
                }
            }
        }
        return (stack.size() == 0);
    }

    private char getOppositeBracket(char ch) {
        for (char[] bracket : brackets) //перебираем массив массивов (массив brackets состоит из массива char)
        {
            if (ch == bracket[1]) {
                return bracket[0];
            }
        }
        return ' ';
    }

    private boolean isOpenBracket(char ch) {
        for (char[] bracket : brackets) {
            if (ch == bracket[0]) {
                return true;
            }
        }
        return false;
    }
}
