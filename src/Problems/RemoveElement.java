package Problems;

import org.junit.Test;

import java.util.Arrays;

public class RemoveElement {
    @Test
    public void example(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println( removeEle2(nums,val));
    }

    private int removeEle2(int[] nums, int val) {
        int left =0, right= nums.length-1;
        while(left <= right){
            if (nums[left] ==val){
                nums[left] = nums[right];
                right--;
            }else{
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return left;
    }

    private int removeEle1(int[] nums, int val) {
        int writeIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
            nums[writeIndex++] = nums[i];}
        }
            return writeIndex;
    }

    private int removeEle(int[] nums, int val) {
        int count =0;
        for(int i:nums){
            if (i==val) count++;
        }

        return (nums.length)-count;
    }
}
