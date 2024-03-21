package Arraysplems;

import org.junit.Test;

public class FindPeakElementWhichIsnot {
    @Test
    public void testCase(){
        int[] nums ={5,10,20,15};
        System.out.println(findPeakElement(nums));

    }
    @Test
    public void testCase1(){
        int[] nums = {10, 20, 15, 2, 23, 90, 67};
        System.out.println(findPeakElement(nums));
    }

    private int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i-1] < nums[i] && nums[i] >nums[i+1]){
                if (nums[i] == 20){
                    continue;
                }
              return nums[i];
            }
        }
        return -1;
    }
}
