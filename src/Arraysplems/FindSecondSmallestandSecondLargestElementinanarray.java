package Arraysplems;

import org.junit.Test;

import java.util.Arrays;

public class FindSecondSmallestandSecondLargestElementinanarray {
    @Test
    public void testCase(){
        int[] nums = {1,2,4,7,7,5};
        System.out.println(solution1(nums));
    }

    private String solution1(int[] nums) {
        int fMax = Integer.MIN_VALUE, fMin = Integer.MAX_VALUE;
        int sMax = Integer.MIN_VALUE, sMin = Integer.MAX_VALUE;
        for (int num:nums) {
            fMax = Math.max(fMax, num);
            fMin = Math.min(fMin, num);
        }
        for (int num:nums) {
            if (num > sMax&& fMax!=num){
                sMax = num;
            }
            if (num < sMin && fMin!=num){
                sMin = num;
            }
        }
        return ""+sMax+"-->"+sMin;
    }

    private String solution(int[] nums) {
        Arrays.sort(nums);
        return ""+nums[1]+" --> "+nums[nums.length-2];
    }
}
