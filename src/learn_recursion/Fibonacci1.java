package learn_recursion;

import org.junit.Test;

public class Fibonacci1 {
    @Test
    public void testCase(){
        int n = 5;
        System.out.println(solution(n));
    }

    private int solution(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }
}
