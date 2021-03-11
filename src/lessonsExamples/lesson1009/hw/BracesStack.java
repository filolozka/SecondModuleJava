package lessonsExamples.lesson1009.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BracesStack {
    private Stack<Character> bracesStack;
    private boolean correctBraces;

    public boolean checkBraces(String stringWithBraces) {
        this.bracesStack = new Stack<>();
        char[] charArray = stringWithBraces.toCharArray();
        label:
        for (int i = 1; i < stringWithBraces.length(); i++) {
            switch (charArray[i]) {
                case '{':
                case '(':
                case '[':
                    System.out.println(bracesStack.push(stringWithBraces.charAt(i)));
                    break;
                case '}':
                case ')':
                case ']':
                    if (!bracesStack.empty()) {
                        char temp = bracesStack.pop();
                        if (temp != '{') {
                            correctBraces = false;
                        }
                    } else {
                        correctBraces = false;
                        break label;
                    }
                    break;
            }
        }
        return this.correctBraces;
    }

}
