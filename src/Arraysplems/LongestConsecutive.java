package Arraysplems;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    @Test
    public void testCase(){
        int[] nums = {100, 200, 1, 3, 2, 4};
        System.out.println(solution(nums));
    }

    private int solution(int[] nums) {
        int longest =1;
        for(int i =0; i < nums.length; i++){
            int x = nums[i], count =1;
            while(leanerSearch(nums, x+1)){
                x++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    private boolean leanerSearch(int[] nums, int i) {
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]==i){
                return true;
            }
        }
        return false;
    }
}
