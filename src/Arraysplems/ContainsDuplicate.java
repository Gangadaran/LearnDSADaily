package Arraysplems;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
   @Test
    public void testCase(){
        int[] nums = {1,2,3};
       System.out.println(findDuplicate(nums));
    }

    private boolean findDuplicate(int[] nums) {
      Set<Integer> duplicates = new HashSet<>();
        for (int num:nums) {
            if (duplicates.contains(num)){
                return true;
            }
            duplicates.add(num);
        }
        return false;
    }
}
