package learn_java;

import org.junit.Test;

import java.util.Stack;

public class RemoveOutermostParentheses {
@Test
    public void example(){
        String s = "(()())(())";
        removeOuter(s);
    }

    private void removeOuter(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) {
                    // Add the inner '(' to the result
                    result.append(c);
                }
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance > 0) {
                    // Add the inner ')' to the result
                    result.append(c);
                }
            }
        }

    }
}
