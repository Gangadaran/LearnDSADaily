package knowbasicmath;

import org.junit.Test;

public class ExtractNumber {
    @Test
    public void testCase(){
        int num = 7789;
        printNum(num);
    }

    private void printNum(int num) {
        while(num > 0){
            int last = num%10;
            System.out.println(last);
            num = num/10;
        }
    }
}
