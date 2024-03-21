package learn_recursion;

import org.junit.Test;

public class SubSequence {
    @Test
    public void example(){
        subSet("", "abc");
    }

    private void subSet(String p, String up) {
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        subSet(p+c, up.substring(1));
        subSet(p, up.substring(1));
    }



}
