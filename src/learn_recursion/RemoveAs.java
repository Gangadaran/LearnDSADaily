package learn_recursion;

import org.junit.Test;

import java.lang.module.FindException;

public class RemoveAs {
    @Test
    public void testCase(){
        String name ="gangadaran";
        char target = 'a';
        int index =0;
        StringBuilder stringBuilder = removeAsss(name, target, new StringBuilder(), index);
        System.out.println(stringBuilder);
    }

    private StringBuilder removeAsss(String name, char target, StringBuilder stringBuilder, int index) {
        if (index >= name.length()) return stringBuilder;
        if (name.charAt(index) != target){
            stringBuilder.append(name.charAt(index));
        }
        return removeAsss(name, target,stringBuilder,++index);
    }

    private String removeAss(String name) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
           if (name.charAt(i)!='a'){
               sb.append(name.charAt(i));
           }
        }
        return sb.toString();
    }
}
