package Arraysplems;

import org.junit.Test;

public class MinimumSizeSubarraySum {
   @Test
    public void testCase(){
        int[] nums = {1,4,4};
        int target = 4;
       System.out.println(solution(nums, target));
    }

    private int solution(int[] nums, int target) {
        int minLength = Integer.MAX_VALUE;
        int sum =0;
        for (int i = 0, j =0; j < nums.length ; j++) {
            sum += nums[j];
            while(sum >= target){
                minLength = Math.min(minLength, j-i+1);
                sum -=nums[i];
                i++;
            }
        }
        return minLength==Integer.MAX_VALUE ? 0:minLength;
    }
}
