package learn_recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LeanierSearch {
    @Test
    public void testCase(){
        int[] nums ={3,2,8,4,3,9,10,10};
        int target = 10;
        int index =0;
        System.out.println(findTargetElement(nums,target,index,new ArrayList<>()));

    }



    private List<Integer> findTargetElement(int[] nums, int target, int index, List<Integer> list) {
        if (index >= nums.length) return list;
        if (nums[index]==target) {
            list.add(index);
        };
         return findTargetElement(nums, target,++index, list);
    }
}
