package learn_recursion;


import org.junit.Test;

public class FibonacciNumber {
    /*
    https://leetcode.com/problems/fibonacci-number/description/
     */
    @Test
    public void example(){
        int n = 4;
        System.out.println(fibo(n));
    }

    private int fibo(int n) {
        if (n <=1) return n;
         int last = fibo(n-1);
         int sLast = fibo(n-2);

            return last+sLast;

    }
}
