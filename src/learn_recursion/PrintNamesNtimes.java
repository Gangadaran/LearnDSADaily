package learn_recursion;

public class PrintNamesNtimes {
    public static void printName(int i, int n){
        if ( i == n){
            return;
        }
        System.out.println("Gangadaran");
        printName(i+1, n);
    }

    public static void main(String[] args) {
        printName(1,10);
    }
}
