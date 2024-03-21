package Problems;

import org.junit.Test;

import java.util.Arrays;

public class ReverseTheArray {
    @Test
    public void example(){
        int[] nums = {1,2,3,4,5,6,7,8};
        int left =0, right = nums.length-1;
        System.out.println(Arrays.toString(reverseNums1(nums,left,right)));
    }

    private int[] reverseNums1(int[] nums, int left, int right) {
        if (left > right) return nums;
        swapArr(left, right, nums);
        return reverseNums1(nums, left+1, right-1);


    }

    private void swapArr(int left, int right, int[] nums) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    private int[] reverseNums(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }
}
