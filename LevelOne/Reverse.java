package Recursion.LevelOne;

public class Reverse {
    static int reversed=0;
    private static void rvrs2(int n) {
        if(n==0) return;
        reversed=reversed*10+(n%10);
        rvrs2(n/10);
    }
    public static void main(String[] args) {
        int num =19023;
        System.out.println(rvrs1(0,num));
        rvrs2(num);
        System.out.println(reversed);
        System.out.println(rvsr3(num));

    }

    private static int rvsr3(int n) {
        int digit=(int)(Math.log10(n)+1);
        return helper(n,digit);
    }

    private static int helper(int n, int digit) {
        if(n%10==n) return n;
        return (n%10)*(int)Math.pow(10,digit-1)+helper(n/10,digit-1);
    }

    //this  is the most efficient one
    public static int rvrs1(int rev, int n) {
        if (n==0) return rev;
        return rvrs1(rev*10+(n%10),n/10);
    }

}
