package learn_recursion;

public class Demo {
    public static void main(String[] args) {
      // print hello word
        print(1);
    }

    static void print(int n){
        if (n>5) return;
        System.out.println(n);
        print(n+1);

    }



}