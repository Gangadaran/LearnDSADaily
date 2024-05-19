package Arraysplems;

import org.junit.Test;

import java.util.*;

public class SortAnArrayOf {
    @Test
    public void testCase(){
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(solution(nums)));
    }

    private int[] solution(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int num: nums){
            set.add(num);
        }
        System.out.println(set);
        List<Integer> list = new ArrayList<>(set);

        for(int i=0; i< set.size(); i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}
