package knowbasicmath;

import org.junit.Test;

public class Checkifanumberisprimeornot {
    @Test
    public void testCase(){
        int num = 10;
        System.out.println(solution(num));
    }

    private boolean solution(int num) {
        int count =0;
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                count++;
            }
        }
       return count==2;
    }
}
