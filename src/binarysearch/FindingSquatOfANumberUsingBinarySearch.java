package binarysearch;

import org.junit.Test;

public class FindingSquatOfANumberUsingBinarySearch {
    @Test
    public void testCase(){
        int n = 36;
        System.out.println(solution(n));
    }

    private int solution(int n) {
        int left = 1, right =n;
        while(left <= right){
            int mid = (left+right)/2;
            int val = mid*mid;
            if (val <= n){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return right;
    }
}
