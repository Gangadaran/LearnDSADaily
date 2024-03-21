package Problems;

import org.junit.Test;

import java.util.Arrays;

public class ReverseArrayInKGroup {
    @Test
    public void testCase(){
        int[] nums = {1,2,3,4,5};
        int k =2;
        System.out.println(Arrays.toString(reverseArray(nums, k)));

    }

    private int[] reverseArray(int[] nums, int k) {
        for (int i = 0; i <= k-1; i++) {

            int temp = nums[i];
            nums[i] = nums[k-1];
            nums[k-1] = temp;
            k--;
            if (i>k){
                k= k*2;
                i=k;
            }
        }
        return nums;
    }
}
