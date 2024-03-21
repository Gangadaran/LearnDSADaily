package learn_recursion;

import org.junit.Test;

public class ReverseName {
    @Test
    public void example(){
        String name ="Gangadaran";
        int left =0, right = name.length()-1;
        char[] arr = name.toCharArray();
        StringBuilder sb = new StringBuilder();
        System.out.println(reverseName1(left, right, name, sb));

    }

    private String reverseName1(int left, int right, String name, StringBuilder sb) {
        if (left > right) return sb.toString();
        if(left <= right && name.charAt(left)!= 'a'){
            sb.append(name.charAt(left));
        }
        return reverseName1(left+1,right,name,sb);
    }

    private char[] reverseName(int left, int right, char[] arr) {
        if (left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

             reverseName(left+1, right-1, arr);
        }
        return arr;

    }


}
