package Arraysplems;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    @Test
    public void testCase(){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(solution(nums));
    }

    private int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max =0;
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            max = Math.max(max, map.get(num) );
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max == entry.getValue()){
                return entry.getKey();
            }
        }
return -1;
    }
}
