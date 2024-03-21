package Problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringInteger {
   @Test
    public void example(){
       int[] nums = {1,3,-1,-3,5,3,6,7};
       System.out.println(Arrays.toString(findSlidingWindowMax(nums)));
   }

    private int[] findSlidingWindowMax(int[]  nums) {
       int first =0, third = 2;
       int[] temp = new int[nums.length-2];
       int index =0;
        while(first < nums.length-2){
            temp[index++]=findMax(first, third, nums);
            first++;
            third++;
        }
    return temp;
    }

    private int findMax(int first, int third, int[] nums) {
       int max = Integer.MIN_VALUE;
        for (int i = first; i <= third; i++) {
            max = Math.max(nums[i],max);
        }
        return max;
    }


}
