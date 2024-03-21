package learnstack;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LearnStack {
    public int[] data;
    public int pointer = -1;
    public  static final int DEFAULT_VALUE = 10;
    public LearnStack(){
        this(DEFAULT_VALUE);
    }
    public LearnStack(int value){
        this.data = new int[value];
    }
    public boolean push(int value){
        if (pointer >= data.length-1) return false;
        data[++pointer] = value;
        return true;
    }

    public int pop(){
        if (pointer < 0) return -1;
        return data[pointer--];
    }

    public int peek(){
        if (pointer==-1) return -1;
        return data[pointer];
    }

        public static void main(String[] args) {
            int[] nums = {1,2,3,4,5,6,7,8};
            for (int i = 1; i < nums.length; i++) {
                nums[i-1]=nums[i];
            }

            System.out.println(Arrays.toString(nums));


        }

}
