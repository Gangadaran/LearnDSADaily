package learn_recursion;

import org.junit.Test;

public class FindTheArraySorted {
   @Test
    public void testCase(){
        int[] nums ={1,2,3,4,5,6,7,8,9};
        int left = 0, right = 1;

       System.out.println(findTheSortRecu(nums,left,right));
    }

    private boolean findTheSortRecu(int[] nums,int left,int right) {
       if (nums.length-1==right) return true;
       if (nums[left] > nums[right]) return false;
       return findTheSortRecu(nums,++left, ++right);

    }

    private boolean findTheSort(int[] nums) {
        int left = 0, right =1;
        while(right <= nums.length-1){
            if (nums[left] > nums[right]) return false;
            right++;
            left++;
        }
        return true;
    }
}
