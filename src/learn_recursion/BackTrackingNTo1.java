package learn_recursion;

public class BackTrackingNTo1 {
    public static void print(int i , int j){
        if (i > j){
            return;
        }
        print(i+1, 3);
        System.out.println(i);
    }

    public static void main(String[] args) {
        print(1,3);
    }
}
