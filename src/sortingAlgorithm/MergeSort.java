package sortingAlgorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    @Test
    public void testCase(){
        int[] nums = {4,2,1,6,7};
        int left =0, right = nums.length-1;
        solution(nums,left, right);
        System.out.println(Arrays.toString(nums));
    }

    private void solution(int[] nums,int left, int right) {
        if (left < right){
           int mid = (left+right)/2;
            solution(nums, left, mid);
            solution(nums, mid+1, right);
            swapNums(nums, left, mid, right);

        }
    }

    private void swapNums(int[] nums, int left, int mid, int right) {
        List<Integer> list = new ArrayList<>();

        int low = left;
        int high = mid + 1;
        while (low <= mid && high <= right) {
            if (nums[low] < nums[high]) {
                list.add(nums[low]);
                low++;
            } else {
                list.add(nums[high]);
                high++;
            }
        }
        while (low <= mid) {
            list.add(nums[low]);
            low++;
        }
        while (high <= right) {
            list.add(nums[high]);
            high++;
        }

        for (int i = left; i <= right; i++) {
            nums[i] = list.get(i -left);
        }
    }


}
