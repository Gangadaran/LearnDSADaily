package learn_recursion;

import org.junit.Test;

public class Pattern {
    @Test
    public void testCase(){
        printStars1(4);
    }

    private void printStars1(int n) {
        for (int j = 1; j <=n; j++) {
            for (int i = 0; i <= n-j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void printStars(int n) {
        if (n==0) return;
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        printStars(n-1);
    }
}
