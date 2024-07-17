package stringproblems;

import org.junit.Test;

public class LongestCommonPrefix {
    @Test
    public void testCase(){
        String[] strs = {"dog","racecar","car"};
        solution(strs);
    }

    private String solution(String[] strs) {
        String temp = "";
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            char c =word.charAt(i);
            for (int j = i+1; j < strs.length; j++) {
                if (c!=strs[j].charAt(i)){

                    return temp;
                }
                temp += Character.toString(c);
                break;
            }

        }

        return temp;
    }
}
