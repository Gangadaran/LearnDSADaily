package Problems;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindLastOccurence {
    @Test
    public void example(){
        int[] nums = {1,2,3,5,6,6,6,7,7};
        int target = 6;
        findLastOccurence(nums, target);
    }

    private void findLastOccurence(int[] nums, int target) {
        int lastOccurence = -1;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==target){
                lastOccurence = i;
                break;
            }
        }
        if (lastOccurence !=1){
            System.out.println(lastOccurence);
        }else{
            System.out.println("Nothing found");
        }

    }
}
