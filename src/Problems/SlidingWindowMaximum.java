package Problems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class SlidingWindowMaximum {
    public void example(){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k =3;
        findMax(nums,k);
    }

    private void findMax(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
           queue.offer(nums[i]);
        }

    }
}
