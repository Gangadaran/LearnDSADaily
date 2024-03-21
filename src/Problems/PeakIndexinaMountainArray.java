package Problems;

import org.junit.Test;

public class PeakIndexinaMountainArray {

    @Test
    public void example(){
        int[] arr ={1, 3, 5, 9, 10, 11, 8, 4, 2};
        int max = findMax1(arr);
        System.out.println(max);
    }

    private int findMax1(int[] arr) {
        int left = 0, right = arr.length - 1;


        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                // arr[mid] is the peak element
                return mid;
            } else if (arr[mid - 1] > arr[mid]) {
                // Peak element is on the left side
                right = mid;
            } else {
                // Peak element is on the right side
                left = mid + 1;
            }
        }

        // This line is not strictly necessary, as the problem assumes a valid mountain array.
        // It's included for completeness and as a safety check.
        return left;
    }

    private int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int output:arr) {
            if (output > max){
                max =  output;
            }
        }
       for (int i =0; i < arr.length; i++){
           if (arr[i]==max){
              return i;
           }
       }
       return -1;
    }

}
