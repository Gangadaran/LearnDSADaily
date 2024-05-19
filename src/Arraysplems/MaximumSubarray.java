package Arraysplems;

import org.junit.Test;

public class MaximumSubarray {
    @Test
    public void testCase(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArr2(nums));
    }

    private int maxSubArr2(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max){
                max = sum;
            }
            if(sum < 0){
                sum =0;
            }

        }
        return max;
    }

    private int maxSubArr1(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum =0;
            for (int j = i; j < nums.length; j++) {
                sum +=nums[j];
                max = Math.max(max, sum);
            }

        }
        return max;
    }

    private int maxSubArr(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum =0;
                for (int k = i; k <=j ; k++) {
                    sum += nums[k];
                }
               max = Math.max(max, sum);
            }

        }
        return max;
    }
}
