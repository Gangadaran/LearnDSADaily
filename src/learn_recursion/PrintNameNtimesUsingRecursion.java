package learn_recursion;

public class PrintNameNtimesUsingRecursion {

    void f(int i, int n){
        if (i>n){
            return;
        }
        System.out.println("Ganga");
        f(i+1, n);
    }

    public static void main(String[] args) {
        new PrintNameNtimesUsingRecursion().f(1, 3);
    }
}
