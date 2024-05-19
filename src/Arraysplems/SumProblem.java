package Arraysplems;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumProblem {
    @Test
    public void testCase(){
        int[] nums = {2,6,5,8,11};
        int target = 15;
        System.out.println(Arrays.toString(solution(nums, target)));

    }

    private int[] solution(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int moreNeeded = target-num;
            if (map.containsKey(moreNeeded)){
                return new int[] {i, map.get(moreNeeded)};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
