package learn_recursion;

import org.junit.Test;

import java.util.Arrays;

public class ReverseArray {
    @Test
    public void example(){
        int[] arr = {1,2,3,4,5};
        int left =0, right = 4;
        f(left, right, arr);

    }

    private static void f(int left, int right, int[] arr) {
        if (left >= right) {
            return;
        }
        swap(left, right, arr);
        f(++left, --right, arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int left, int right, int[] arr) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
