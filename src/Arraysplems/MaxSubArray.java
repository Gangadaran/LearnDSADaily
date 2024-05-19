package Arraysplems;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {
    @Test
    public void testCase(){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        findMaxSubArr(arr);
    }

    private void findMaxSubArr(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                max +=arr[j];
            }
            temp.add(max);
        }
        System.out.println(temp);
    }
}
