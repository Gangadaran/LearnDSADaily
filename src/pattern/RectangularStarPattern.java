package pattern;

import org.junit.Test;

public class RectangularStarPattern {
    @Test
    public void example(){
        int n = 5;
        printStarts4(n);
    }

    private void printStarts4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void printStarts3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private void printStarts2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    private void printStarts1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void printStarts(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
