package stringproblems;

import org.junit.Test;

import java.util.Stack;

public class RemoveOuterParentheses {
    @Test
    public void testCase(){
        String s = "(()())(())";
        System.out.println(solution(s));
    }

    private String solution(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the input string
        for (char ch : s.toCharArray()) {
            // If it's an opening parenthesis
            if (ch == '(') {
                // Only append to result if the stack is not empty (not an outer parenthesis)
                if (!stack.isEmpty()) {
                    result.append(ch);
                }
                stack.push(ch);
            } else {
                // It's a closing parenthesis
                stack.pop();
                // Only append to result if the stack is not empty (not an outer parenthesis)
                if (!stack.isEmpty()) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}
