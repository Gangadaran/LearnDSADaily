package sortingAlgorithm;

import org.junit.Test;

import java.util.Arrays;

public class MergeSort1 {
    @Test
    public void example(){
        int[] nums = {9,3,7,5,6,4,8,2};
        int left = 0, right = nums.length-1;
        System.out.println(Arrays.toString(mergeSortArr(nums,left,right)));

    }

    private int[] mergeSortArr(int[] nums, int left, int right) {
        if (left >= right){
            return nums;
        }
        int mid = (left+right)/2;
        mergeSortArr(nums, left, mid);
        mergeSortArr(nums,mid+1,right);
        mergeArr(nums,left, right);
        return nums;

    }

    private void mergeArr(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            leftArr[i] = nums[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = nums[mid + 1 + j];

        // Merge the temporary arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                nums[k] = leftArr[i];
                i++;
            } else {
                nums[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr[] if any
        while (i < n1) {
            nums[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr[] if any
        while (j < n2) {
            nums[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
