package Arraysplems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;



public class LeadersinanArray {
    @Test
    public void testCase(){
        int[] nums = {10, 22, 12, 3, 0, 6};
        solution1(nums);
    }

    private void solution1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i] > max) {
                max = Math.max(max, nums[i]);
                list.add(max);
            }
        }
        System.out.println(list);
    }

    private void solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (linearSearch(nums, i)){
                list.add(nums[i]);
            }

        }

        System.out.println(list);
    }

    private boolean linearSearch(int[] nums, int i) {
        for (int j = i+1; j < nums.length; j++) {
            if(nums[i] < nums[j]) return false;
        }
        return true;
    }
}
