package learn_recursion;

public class BackTracking1ToN {
    public static void printToN(int i, int n){
        if (i < 1){
            return;
        }
        printToN(i-1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        printToN(3,3);
    }
}
