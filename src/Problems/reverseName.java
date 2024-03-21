package Problems;

import org.junit.Test;

import java.util.Arrays;

public class reverseName {
    @Test
    public void example(){
        String name = "Gangadaran";
        char[] chars = name.toCharArray();
        int left=0, right = name.length()-1;
        System.out.println(Arrays.toString(reverseN(chars, left, right)));
    }

    private char[] reverseN(char[] chars, int left, int right) {
      if (left > right) return chars;
      char temp = chars[left];
      chars[left] = chars[right];
      chars[right] = temp;
      return reverseN(chars, left+1,right-1);
    }
}
