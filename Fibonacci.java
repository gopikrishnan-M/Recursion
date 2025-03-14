package Recursion;
//this program prints the nth fibanacci number
public class Fibonacci {
    public static void main(String[] args) {
        // first  check weather a problem can be broken down into smaller problems or not
        // if possible then write a formula for that this formula is known as recurrence relation
        // now try to figure out the recursive tree
        //always try to see three variable passing parameter,body, return variable.
        System.out.println(fibo(5));
    }

    private static int fibo(int n) {
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
