package binarysearch;

import org.junit.Test;

public class BinarySearch {

    @Test
    public void testCase(){
        int[] arr = {3,8,30,58,90,4473,8596};
        int target = 90;
        System.out.println(findTargetValue(arr, target, 0, arr.length-1));
    }

    private int findTargetValue1(int[] arr, int target, int i, int i1) {
        if (arr==null ) return -1;
        int left = 0, right = arr.length-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if (arr[mid]==target) return mid;
            if (arr[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }


        }
        return left;


    }

    private int findTargetValue(int[] arr, int target, int i, int i1) {
        if (i > i1) return -1;
        int m = i+(i1-i)/2;
        if (arr[m]==target) return m;
        if (target < arr[m]) return findTargetValue(arr, target,i,m);
        return findTargetValue(arr, target,m+1,i1);
    }
}
