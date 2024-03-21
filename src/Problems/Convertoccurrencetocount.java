package Problems;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Convertoccurrencetocount {
    @Test
    public void example(){
        String word ="aabbbc";
        System.out.println(convertToCount1(word));
    }

    private String convertToCount1(String word) {
        if (word==null || word.isEmpty()) return word;
        StringBuilder sb = new StringBuilder();
        char currentChar = word.charAt(0);
        int count =1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i)==currentChar){
                count++;
            }else{
                sb.append(currentChar).append(count);
                currentChar = word.charAt(i);
                count = 1;
            }

        }
        sb.append(currentChar).append(count);
    return sb.toString();
    }

    private String convertToCount(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i:word.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        StringBuilder sb = new StringBuilder();

        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();
            sb.append(next.getKey());
            sb.append(next.getValue());
        }

        return sb.toString();
    }
}
