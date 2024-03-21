package learn_recursion;

import org.junit.Test;

public class Factorial {
   @Test
    public void testCase(){
        System.out.println(findFactorial(5));
    }

    private int findFactorial(int i) {
        if (i==1) return i;
        return i*findFactorial(i-1);
    }
}
