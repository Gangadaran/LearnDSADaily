package binarysearch;

import org.junit.Test;

public class SearchSingleElement {
    @Test
    public void testCase(){
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(solution(nums));
    }

    private int solution(int[] nums) {
        if (nums.length==1) return nums[0];
        if (nums[0]!=nums[1]) return nums[0];
        if (nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
        int left =1, right = nums.length-2;
        while(left <= right){
            int mid = (left+right)/2;
            if (nums[mid-1]!=nums[mid] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if ((nums[mid]%2==1 &&  (mid-1)==nums[mid]) || (mid%2==0 && nums[mid+1]==nums[mid])){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
        return -1;

    }
}
