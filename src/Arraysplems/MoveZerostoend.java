package Arraysplems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerostoend {
    @Test
    public void testCase(){
        int[] nums = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        solution(nums);
        System.out.println(Arrays.toString(nums));
    }

    private void solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                list.add(nums[i]);
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nums[i] = list.get(i);
        }
        for (int i = size; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
