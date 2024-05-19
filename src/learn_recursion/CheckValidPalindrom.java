package learn_recursion;

import org.junit.Test;

public class CheckValidPalindrom {
    @Test
    public void testCase(){
        String s = "ABCDCBA";
        System.out.println(solution(s));
    }

    private boolean solution(String s) {
        int left =0, right = s.length()-1;
        char[] temp = s.toCharArray();
        for(int i=0; i< right; i++){
            char newChar = temp[left];
            temp[left] = temp[right];
            temp[right] = newChar;
            left++;
            right--;
        }
        String out = "";
        for(char c:temp){
            out +=c;
        }
        return s.equals(out);
    }


}
