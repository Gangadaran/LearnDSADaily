package Arraysplems;

import org.junit.Test;

import java.util.Arrays;

public class RotatearraybyKelements {
    @Test
    public void testCase(){
        int[] nums = {3,7,8,9,10,11};
        int k = 3;
        solution(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    private void solution(int[] nums, int k) {
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        for (int i = k; i < nums.length; i++) {
              nums[i-k] = nums[i];
        }
        int j =0;
        for (int i = nums.length-k; i < nums.length ; i++) {
            nums[i] = temp[j++];
        }
    }
}
