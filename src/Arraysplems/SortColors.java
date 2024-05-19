package Arraysplems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortColors {
    @Test
    public void testCase() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int left = 0, right = nums.length - 1;
        solution(nums, left, right);
        System.out.println(Arrays.toString(nums));
    }

    private void solution(int[] nums, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;
            solution(nums, left, mid);
            solution(nums, mid + 1, right);
            mergeArray(nums, left, mid, right);
        }
    }

    private void mergeArray(int[] arr, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid +1;
        while(left <=mid && right <=high){
            if (arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            list.add(arr[left]);
            left++;
        }

        while (right <= high){
            list.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }
}
