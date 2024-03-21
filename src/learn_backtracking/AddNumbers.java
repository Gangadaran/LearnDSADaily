package learn_backtracking;

import org.junit.Test;

public class AddNumbers {
    @Test
    public void example(){
        int num = 0,sum =0;

        System.out.println( backTracking(num,sum));
    }

    private int backTracking(int num, int sum) {
        if (num >= 10) {
            return sum; // If num is greater than or equal to 10, return the current sum
        }

        // Recursively call the function for the next number and update the sum
        sum = backTracking(num + 1, sum) + sum;

        return sum;
    }

}
