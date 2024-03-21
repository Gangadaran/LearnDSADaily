package stack_queue_problems;

import org.junit.Test;

import java.util.*;

public class NextGreaterElement {
    @Test
    public void example(){
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] output =findNextGreaterElement1(nums1,nums2);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    private int[] findNextGreaterElement1(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
         // 1,3,4,2
        // Find next greater element for each element in nums2
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Fill the result array with the next greater elements
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }
        return result;
    }

    private int[] findNextGreaterElement(int[] nums1, int[] nums2) {
           List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int index = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]){
                    index = j;
                    break;
                }
            }

            boolean flog = false;

            for (int j = index+1; j < nums2.length; j++) {
                if (nums2[j] > nums2[index]){
                    list.add(nums2[j]);
                    flog = true;
                    break;
                }
            }

            if (!flog){
                list.add(-1);
            }
        }
        int[] result = new int[list.size()];
        int indeces = 0;
        for(int num:list){
            result[indeces++] = num;
        }
        return result;
    }
}
