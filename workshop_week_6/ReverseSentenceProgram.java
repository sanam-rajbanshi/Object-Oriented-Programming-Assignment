package workshop6;

import java.util.Stack;

public class ReverseSentenceProgram {
    public static void main(String[] args) {

        String sentence = "Hello World";

        Stack<String> stack = new Stack<>();

        String[] words = sentence.split(" ");

        for (String w : words) {
            stack.push(w);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}