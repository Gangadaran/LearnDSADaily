package learn_recursion;

import org.junit.Test;

import java.util.Arrays;

public class ReverArray1 {
   @Test
    public void testCase(){
       int[] arr = {5,4,3,2,1};
       int left =0, right = arr.length-1;
       System.out.println(Arrays.toString(arr));
       reverseArr(arr,left, right);
       System.out.println(Arrays.toString(arr));
   }

    private void reverseArr(int[] arr, int left, int right) {
       if(left < right){
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           left++;
           right--;
           reverseArr(arr,left, right);
       }
    }
}
