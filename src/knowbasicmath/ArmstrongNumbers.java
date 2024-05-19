package knowbasicmath;

import org.junit.Test;

public class ArmstrongNumbers {
    @Test
    public void testCase(){
        int num = 999;
        System.out.println(solution(num));
    }

    private int solution(int num) {
        int temp = 0;
        while(num >0){
            int last = num%10;
            temp = temp+(last*last*last);
            num = num/10;
        }
        return temp;
    }
}
