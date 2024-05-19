package knowbasicmath;

import org.junit.Test;

public class PrintallDivisorsofagivenNumber {
    @Test
    public void testCase(){
        int n = 97;
        solution(n);
    }

    private void solution(int n) {
        int count =1;
        while(count <= n){
            if(n%count==0){
                System.out.println(count);
            }
            count++;
        }
    }
}
