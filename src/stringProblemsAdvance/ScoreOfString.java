package stringProblemsAdvance;

import org.junit.Test;

public class ScoreOfString {
    @Test
    public void testCase(){
        String s = "hello";
        solution(s);
    }

    private void solution(String s) {
        int count = 0;
        for(int i =1; i < s.length(); i++){
            int first = s.charAt(i-1), second = s.charAt(i);

            count += Math.abs((first-second));
        }
        System.out.println(count);
    }
}
