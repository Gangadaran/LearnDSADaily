package stringproblems;

import org.junit.Test;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseWordsInAString {
    @Test
    public void testCase(){
        String s = "the sky is blue";
        solution(s);
    }

    private void solution(String s) {
        String ouput = new String();
        int length = s.length();
        int i =0, j=i+1;
        while(i < length){
            while(i < length && s.charAt(i)== ' '){
                i++;
            }
            while (j < length && s.charAt(j) != ' '){
                j++;
            }
            String word = s.substring(i, j);
            ouput += word+" ";
        }
        System.out.println(ouput);

    }

    public static void main(String[] args) {
        String name = "  hello world  ";
        String[] words = name.split("\\s+");
        String res = "";
        for (int i = words.length-1; i >=0 ; i--) {
            res = res+words[i]+" ";
        }
        System.out.println(res.trim());
    }
}
