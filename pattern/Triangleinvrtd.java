package Recursion.pattern;

public class Triangleinvrtd {
    public static void main(String[] args) {

        secondWayNormal(5,0);
    }

    private static void patternTri(int n) {
        if(n==0) return;
        printRow(n);
        System.out.println();
        patternTri(n-1);
    }
    private static void printRow(int i) {
        if(i==0) return;
        System.out.print("* ");
        printRow(i-1);
    }
    private static void secondWay(int r,int c){
        if(r==0) return;
        if(r>c) {
            System.out.print("* ");
            secondWay(r,c+1);
        }
        else {
            System.out.println();
            secondWay(r-1,0);
        }

    }
    private static void secondWayNormal(int r,int c){
        if(r==0) return;
        if(r>c) {
            secondWayNormal(r,c+1);
            System.out.print("* ");
        }
        else {
            secondWayNormal(r-1,0);
            System.out.println();
        }

    }
}
