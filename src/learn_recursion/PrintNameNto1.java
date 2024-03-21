package learn_recursion;

public class PrintNameNto1 {
    void f(int n, int i){
        if (n < i){
            return;
        }
        System.out.println("Ganga");
        f(n-1, i);
    }

    public static void main(String[] args) {
        new PrintNameNto1().f(4,1);
    }
}
