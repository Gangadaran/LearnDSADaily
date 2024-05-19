package Arraysplems;

import org.junit.Test;

public class KadanesAlgorithm {
    @Test
    public void testCase(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution(nums));
    }

    private int solution(int[] nums) {
      int max = Integer.MIN_VALUE;
      int sum =0;
      int start = 0, ansStart = -1, ansEnd = -1;
        for (int i = 0; i < nums.length; i++) {
            if (sum==0) start =i;
            sum +=nums[i];
            if(sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0){
                sum =0;
            }
        }
        for (int i = ansStart; i <= ansEnd ; i++) {
            System.out.print(nums[i] +"-->");
        }
        return max;
    }
}
