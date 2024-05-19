package Arraysplems;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    @Test
    public void testCase(){
        int[] nums = {1,1,2,2,2,3,3};
        solution(nums);
    }

    private void solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num:nums) {
            set.add(num);
        }
        
    }
}
