package stringproblems;

import org.junit.Test;

public class LargestOddNumberInString {
    @Test
    public void testCase(){
        String s = "52";
        System.out.println(solution(s));
    }

    private String solution(String s) {
        if (s==null || s.isEmpty()){
            return "";
        }
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)%2==1){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}
