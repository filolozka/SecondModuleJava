package lessonsExamples.lesson1009.hw;

import java.util.Stack;

public class Task {
    public static void main(String[] args) {
        //i{e(w)ii}i[we]
        //return boolean

        String bracesString = "i{e(w)ii}i[we]";

        Stack<Character> bracesStack = new Stack<>();
        for (int i = 1; i < bracesString.length(); i++) {
            bracesStack.push(bracesString.charAt(i));
        }
        System.out.println(bracesStack.search("}"));
    }
}
