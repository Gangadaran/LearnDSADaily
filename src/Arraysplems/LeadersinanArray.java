package Arraysplems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;



public class LeadersinanArray {
    @Test
    public void testCase(){
        int[] nums = {4, 7, 1, 0};
        solution(nums);
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
