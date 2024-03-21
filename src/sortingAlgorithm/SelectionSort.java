package sortingAlgorithm;

import org.junit.Test;

import java.util.Arrays;

public class SelectionSort {
    @Test
    public void example(){
        int[] nums = {3,49,5,2,6,1};
        selectionSortIT(nums);
        System.out.println(Arrays.toString(nums));
    }

    private void selectionSortIT(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

        }

    }
}
