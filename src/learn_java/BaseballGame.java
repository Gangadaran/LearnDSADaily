package learn_java;

import org.junit.Test;

import java.util.Stack;

public class BaseballGame {
    @Test
    public void example(){
        String[] ops = {"5","2","C","D","+"};
        findBaseBallGame(ops);
    }

    private void findBaseBallGame(String[] ops) {
        Stack<Integer> stack =new Stack<>();
        for (String op:ops) {
            switch (op){
                case "C":
                    if (!stack.isEmpty()){
                        stack.pop();
                    }
                    break;
                case "D":
                    if (!stack.isEmpty()) {
                        int temp = stack.peek() * 2;
                        stack.push(temp);
                    }
                    break;
                case "+":
                    if (stack.size() >= 2) {
                        int temp = stack.pop();
                        int temp1 = stack.peek() + temp;
                        stack.push(temp);
                        stack.push(temp1);
                    }
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }

        int count =0;
        for (int c:stack) {
            count +=c;
        }

        System.out.println(count);

    }

    public static void main(String[] args) {
        System.out.println();
    }
}
