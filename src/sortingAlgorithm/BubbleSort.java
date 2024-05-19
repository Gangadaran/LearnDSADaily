package sortingAlgorithm;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSort {
    @Test
    public void testCase(){
        int[] nums = {13,46,24,52,20,9};
        solution(nums);
        System.out.println(Arrays.toString(nums));
    }

    private void solution(int[] nums) {
        for (int i = nums.length-1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i-1; j++) {
                if (nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    didSwap =1;
                }
            }
            if (didSwap==0){
                break;
            }
        }
    }
}
