package Recursion.LevelOne;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumD(123));
        System.out.println(tail(123,0));
    }

    private static int tail(int n,int sum) {

        if (n < 1) {
            return sum;
        }
        sum+=n%10;
        return tail(n/10,sum);

    }

    private static int sumD(int n) {

        if (n < 1) {
            return 0;
        }
        return n%10+sumD(n/10);
    }
}
