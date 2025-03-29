package Recursion.LevelOne;

public class PrintN {
    public static void main(String[] args) {
        //clearly understand these two functions for understanding recursion
        nToOne(5);
        oneToN(5);
    }

    private static void oneToN(int n) {
        if (n < 1) {
            return;
        }
        oneToN(n-1);
        System.out.println(n);
    }

    private static void nToOne(int n) {
        if(n<1){
            return;
        }
        System.out.println(n);
        nToOne(n-1);
    }
}
