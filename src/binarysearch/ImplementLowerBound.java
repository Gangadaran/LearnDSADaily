package binarysearch;

import org.junit.Test;

public class ImplementLowerBound{
    @Test
    public void testCase(){
        int[] nums = {1,2,2,3};
        int target = 2;
        System.out.println(solution(nums, target));
    }

    private int solution(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] >= target) return mid;
            if(nums[mid] <= target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }


}