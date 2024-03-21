package Problems;

import org.junit.Test;

public class RemovingMinimumandMaximumFromArray {
    @Test
    public void example(){
        int[] nums = {2,10,7,5,4,1,8,6};
        removeMaxAndMin(nums);
    }

    private void removeMaxAndMin(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i:nums){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        System.out.println(max+" "+min);

    }
}
