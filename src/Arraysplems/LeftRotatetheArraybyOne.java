package Arraysplems;

import org.junit.Test;

import java.util.Arrays;

public class LeftRotatetheArraybyOne {
    @Test
    public void testCase(){
        int[] nums = {1,2,3,4,5};
        solution(nums);
        System.out.println(Arrays.toString(nums));
    }

    private void solution(int[] nums) {
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = first;
    }
}
