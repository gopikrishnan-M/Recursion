package Recursion;
//this program prints the nth fibanacci number
public class Fibonacci {
    public static void main(String[] args) {
        // first  check weather a problem can be broken down into smaller problems or not
        // if possible then write a formula for that this formula is known as recurrence relation
        // now try to figure out the recursive tree
        //always try to see three variable passing parameter,body, return variable.
        System.out.println(fibo(5));//this has exponential time complexity so for some large numbers like 50 it wont give answers
        System.out.println(fiboFormulae(13));;//this is a derived formula using time complexity and is the best way
    }

    private static int fiboFormulae(int n) {
        return (int)((1/Math.sqrt(5))*(Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)));

        /* double v=Math.pow((1+Math.sqrt(5))/2,n)/Math.sqrt(5);//another formula which ignores the less dominating term
        return (int)v;*/
    }

    private static int fibo(int n) {
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
