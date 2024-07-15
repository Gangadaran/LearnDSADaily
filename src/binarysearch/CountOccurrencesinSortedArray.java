package binarysearch;

import org.junit.Test;

public class CountOccurrencesinSortedArray {
    @Test
    public void testCase(){
        int[] nums = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int target = 3;
        solution(nums, target);
    }

    private void solution(int[] nums, int target) {
        System.out.println(findFirstOccurence(nums, target));
    }

    private int findFirstOccurence(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target){
                return i;
            }
        }
        return -1;
    }


}
