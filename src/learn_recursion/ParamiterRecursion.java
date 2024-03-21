package learn_recursion;

import org.junit.Test;

public class ParamiterRecursion {
    @Test
    public void example(){
        int n = 3;
        sumOfP(n,0);
    }

    private void sumOfP(int n, int i) {
        if (n < 1){
            System.out.println(i);
            return;
        }
        sumOfP(n-1, i+n);
    }
}
