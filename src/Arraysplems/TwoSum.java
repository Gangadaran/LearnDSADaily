package Arraysplems;

import org.junit.Test;

public class TwoSum {
    @Test
    // Positive test
    public void testCase(){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(findTwoSum(nums,target));
    }
    @Test
    // Edge test
    public void testCase1(){
        int[] nums = {2};
        int target =0;
        findTwoSum(nums,target);
    }
    @Test
    // Negative test
    public void testCase2(){
        int[] nums={};
        int target = -1;
        findTwoSum(nums,target);
    }


    private int[] findTwoSum(int[] nums, int target) {
        if (nums.length < 1) return new int[] {};
        int left =0, right = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
