package Arraysplems;

import org.junit.Test;

import javax.swing.event.TreeSelectionEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortAnArray {
    @Test
    public void testCase(){
         int[] nums = {0, 1, 2, 0, 1, 2};
         sortArrays(nums);
    }

    private void sortArrays(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }
}
