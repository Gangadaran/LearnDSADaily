package Problems;

import org.junit.Test;

import java.util.Arrays;

public class MergeTwoArrays {
    @Test
    public void example(){
        int[] nums1 = {1, 3, 5, 7, 10,9 , 11};
        int[] nums2 = {2, 4, 6};
        System.out.println(Arrays.toString(mergeTwoArray(nums1,nums2)));

    }

    private int[] mergeTwoArray(int[] nums1, int[] nums2) {
        int nums1left =0, nums1right =nums1.length-1;
        int nums2left =0, nums2right =nums2.length-1;
        while (nums1left < nums1right && nums2left < nums2right){
            if (nums1[nums1left] < nums2[nums2left]){
                nums1[nums1left] = nums1[nums1left];
                nums1left++;
            }else{
                nums1[nums1left] = nums2[nums2left];
                nums2left++;
            }
        }
        while (nums1left < nums1right){
            nums1[nums1left] = nums1[nums1left];
            nums1left++;
        }
        while (nums2left < nums2right){
            nums1[nums1left] = nums2[nums2left];
            nums2left++;
        }

        return nums1;

    }
}
