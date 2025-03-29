package Recursion.LevelOne;

public class CountZeros {
    public static void main(String[] args) {
        int n=10204;
        System.out.println(counter(n,0));;
    }

    private static int counter(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10==0 && n > 0) {
//            count++;
            return counter(n/10,++count);
        }
        else {
            return counter(n/10,count);
        }
    }
}
