package reworkoflinkedlist;

import org.junit.Test;

public class Reorder {
   @Test
    public void testCase(){
        int[] nums = {1,2,3,4};
       int[] nums1 = reorderArray(nums);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

    private int[] reorderArray(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int temp = nums[left+1];
            nums[left+1] = nums[right];
            nums[left+2] = temp;
            right--;

        }
        return nums;
    }

}
