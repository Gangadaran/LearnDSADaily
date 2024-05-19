package Arraysplems;

import org.junit.Test;

public class BestTimetoBuyandSellStock {
    @Test
    public void testCase(){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit1(prices));
    }

    private int maxProfit1(int[] prices) {
      int maxProfit = 0;
      int minPrice = Integer.MAX_VALUE;
      for(int price : prices){
          minPrice = Math.min(minPrice, price);
          maxProfit = Math.max(maxProfit, price - minPrice);
      }
      return maxProfit;
    }

    private void maxProfit(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }


        }
        for (int i = minIndex; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        System.out.println(minIndex+" "+maxIndex);
    }
}
