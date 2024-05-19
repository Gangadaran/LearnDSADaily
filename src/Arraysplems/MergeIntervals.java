package Arraysplems;

import org.junit.Test;

import java.util.Arrays;

public class MergeIntervals {
    @Test
    public void testCase(){
        int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.toString(mergeInterval(nums)));
    }

    private int[][] mergeInterval(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length-1; j++) {
                if (nums[i][nums[i].length-1] > nums[i+1][0]){
                   nums[i][nums[i].length-1] = nums[i+1][0];
                }
            }
        }
        return nums;
    }
}
