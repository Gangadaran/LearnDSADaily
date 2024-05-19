package learnhashing;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Countingfrequenciesofarrayelements {
    @Test
    public void testCase(){
        int[] nums = {10,5,10,15,10,5};
        solution(nums);
    }

    private void solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num:nums) {
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {

        }
    }
}
