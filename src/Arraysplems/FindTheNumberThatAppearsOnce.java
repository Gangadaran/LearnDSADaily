package Arraysplems;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheNumberThatAppearsOnce {
    @Test
    public void testCase(){
        int[] nums = {4,1,2,1,2};
        System.out.println(solution1(nums));
    }

    private int solution1(int[] nums) {
        int[] temp = new int[nums.length];
        for(int num: nums){
            temp[num]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (temp[i]==1){
                return i;
            }
        }
        return -1;
    }

    private int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry :map.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
