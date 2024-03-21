package learn_java;

import java.util.HashMap;
import java.util.HashSet;

public class Learn_ObjectClass {
    public void doStuff(){
        boolean b = true;
        System.out.println("doStuff");
        go(4);
    }

    private void go(int i) {
        int z = i+24;
        System.out.println("go");
        crazy();
    }

    private void crazy() {
        System.out.println("crazy");
        char c ='a';
    }

    public static void main(String[] args) {

       new Learn_ObjectClass().doStuff();



    }
}
