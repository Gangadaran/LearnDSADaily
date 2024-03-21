package Problems;

import org.junit.Test;

import java.security.KeyStore;
import java.util.*;

public class DuplicateNumberInArray {
    @Test
    public void example(){
        int[] nums ={1,3,4,2,2};
        System.out.println(findDuplicate2(nums));
    }

    private int findDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            if (set.contains(i)){
                return i;
            }else{
                set.add(i);
            }

        }
        return -1;
    }


    private int findDuplicate1(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i:nums) {
            temp[i]++;
        }
        for(int j:temp){
            if (j==2) return j;
        }
        return -1;
    }

    private int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i:nums
             ) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            if (next.getValue()==2) return next.getKey();
        }

//        for (Map.Entry<Integer, Integer> entries:map.entrySet()) {
//            if (entries.getValue()==2) return entries.getKey();
//        }

        return -1;

    }
}
