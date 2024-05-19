package Arraysplems;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class LongestSubstringWithoutRepeatingCharacters {
    @Test
    public void testCase(){
        String s = "abcabcbb";
        System.out.println(solution1(s));
    }

    private int solution1(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength =0;
        for (int start = 0, end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar)){
                start = Math.max(charIndexMap.get(currentChar)+1, start);
            }
          maxLength = Math.max(maxLength, end-start+1);
          charIndexMap.put(currentChar, end);
        }
        return maxLength;
    }


    }

