package learn_recursion;

import org.junit.Test;

public class PrintNto1 {
    @Test
    public void testCase(){
        nTo1(5);
    }

    private void nTo1(int i) {
        if (i < 1) return;

        nTo1(i-1);
        System.out.println(i);
    }
}
