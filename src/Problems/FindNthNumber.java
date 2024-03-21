package Problems;

import org.junit.Test;

public class FindNthNumber {
    @Test
    public void example(){
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        System.out.println(findTargetNum(nums, target));
    }

    private int findTargetNum(int[] nums, int target) {
        int left =0, right = nums.length-1;

        while(left < right){
            int mid = left+(right-left)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                left = mid+1;
            }else{
                 right = mid-1;
            }

        }
        return -1;
    }
}
