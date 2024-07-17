package binarysearch;

import org.junit.Test;

public class FindPeakElement {
    @Test
    public void testCase(){
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(solution(nums));
    }

    private int solution(int[] nums) {
        if (nums.length==1) return nums[0];
        if (nums[0] > nums[1]) return nums[0];
        if (nums[nums.length-1] > nums[nums.length-2]) return nums[nums.length-1];
        int left =1, right = nums.length-2;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(nums[mid] > nums[mid-1]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
