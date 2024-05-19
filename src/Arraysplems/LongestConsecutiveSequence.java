package Arraysplems;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    @Test
    public void testCase(){
        int[] nums = {100,4,200,1,3,2};
        System.out.println(solution1(nums));
    }

    private int solution1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longestStreak = 0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    private int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            min = Math.min(min, num);
            set.add(num);
        }
        int max = 0;
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(set.contains(min+i)){
                count++;
            }else{
                max = Math.max(max, count);
                count =0;
            }

        }
        max = Math.max(max, count);
        return max;

    }
}
