package Arraysplems;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FindtheMajorityElement {
    @Test
    public void testCase(){
        int[] nums = {4,4,2,4,3,4,4,3,2,4};
        System.out.println(solution1(nums));
    }

    private int solution1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
       for(Map.Entry<Integer, Integer> entry:map.entrySet()){
           if (entry.getValue() > nums.length/2){
               return entry.getKey();
           }
       }
       return -1;
    }

    private int solution(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count =0;
            for (int j = 0; j < n; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if (count >= nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}
