package Recursion.LevelOne;

public class Factorial {
    public static void main(String[] args) {
        //System.out.println(fact(0,1));
        System.out.println(facteff(5));
    }

    private static int facteff(int n) {
        //here there are pending multiplication in the return statement in which after every statement the product of
        // n and its previonus factorial is calculated
        if (n < 2) return 1;
        return n*facteff(n-1);
    }

    //first try
    /*
    *  Tail Recursion Optimized: Since the recursive call is the last operation in the method, some
     compilers (or JVM optimizations) may optimize this into a loop-like structure, reducing stack usage.
    * More efficient for larger values of n: Tail recursion can avoid deep recursion stack issues if optimized.
    * Tail recursion is a special type of recursion where the recursive call is the last operation performed in the
      function before returning the result. In simpler terms, there’s no pending computation after the recursive call.*/
    private static int fact(int n,int factorial) {
        if (n < 2) {
            return factorial;
        }
        factorial*=n;
        return fact(n-1,factorial);
    }
}
