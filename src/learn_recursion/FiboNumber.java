package learn_recursion;

import org.junit.Test;

public class FiboNumber {
   @Test
    public void example(){
       int ans = findFibo(4);
       System.out.println(ans);
    }

    private int findFibo(int i) {
       if (i<=1) {
           return i;
       }
       int a = findFibo(i-1);
       int b = findFibo(i-2);
       return a+b;
    }


}
