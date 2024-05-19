package Arraysplems;

import org.junit.Test;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    @Test
    public void testCase(){
        int[] nums1 = {1,3},nums2={2};
        System.out.println(solution(nums1,nums2));
    }

    private double solution(int[] nums1, int[] nums2) {
        int left =0, right =0, index =0;
        int[] temp = new int[nums1.length+nums2.length];
        while(left < nums1.length && right < nums2.length){
            if(nums1[left] < nums2[right]){
                temp[index++] = nums1[left++];
            }else{
                temp[index++] = nums2[right++];
            }
        }
        while(left <nums1.length){
            temp[index++] = nums1[left++];
        }
        while (right < nums2.length){
            temp[index++] = nums2[right++];
        }


        if(index%2==0){
            double result = (temp[index/2]+temp[(index/2)-1])/2.0;
            return result;
        }else{
            double result = temp[index/2];
            return result;
        }
    }
}
