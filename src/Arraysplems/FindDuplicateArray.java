package Arraysplems;

import org.junit.Test;

import java.util.*;

public class FindDuplicateArray {
    @Test
    public void testCase(){
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(solution(nums));
    }

    private int solution(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num: nums){
            if (!seen.add(num)){
                return num;
            }
        }




        return -1;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            innerList.add(i);
        }
        list.add(innerList);
        System.out.println(list);
    }
}
