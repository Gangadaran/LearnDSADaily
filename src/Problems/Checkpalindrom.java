package Problems;

import org.junit.Test;

public class Checkpalindrom {
    @Test
    public void example(){
        String name = "MADAM";
        int left =0, right = name.length()-1;
        System.out.println(checkPalindrom1(name,left, right));
    }

    private boolean checkPalindrom1(String name, int left, int right) {

        if (left > right) return true;
        boolean status = checkPalindrom1(name, left+1, right-1);
        return status;
    }

    private boolean checkPalindrom(String name) {
        int left =0, right = name.length()-1;
        while (left > right){
            if (name.charAt(left++)!=name.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
