package sortingAlgorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    @Test
    public void example(){
        int[] nums = {9, 4, 7, 6, 3, 1, 5 };
        sortNums(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private void sortNums(int[] nums,int low, int high) {
        if (low >= high) return;
        int mid = (low+high)/2;
        sortNums(nums, low, mid);
        sortNums(nums, mid+1,high);
        mergeArr(nums, low, mid, high);
    }

    private void mergeArr(int[] nums, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int  left = low;
        int  right = mid+1;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }
}
