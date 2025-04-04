package Recursion.Subseq;

import java.util.ArrayList;

public class Maize {
    public static void main(String[] args) {
        System.out.println(countWays(3,3));
        System.out.println(arrListPathEff("",4,4));
    }

    private static void showpath(String p, int row, int col) {
        if (col == 1 && row == 1) {
            System.out.println(p);
            return;
        }
        else if (col == 1) {
            showpath(p+'D',row-1,col);
        }
        else if (row == 1) {
            showpath(p+'R',row,col-1);
        }
        else {
            showpath(p+'D',row-1,col);
            showpath(p+'R',row,col-1);
        }
    }
    private static void showpathEff(String p, int row, int col) {
        if (col == 1 || row == 1) {
            if (col == 1) for (int i=1;i< row;i ++) p=p +'D';
            if (row == 1) for (int i=1;i< col;i ++) p=p +'R';
            System.out.println(p);
            return;
        }
        showpathEff(p+'D',row-1,col);
        showpathEff(p+'R',row,col-1);
    }
    private static ArrayList<String> arrListPath(String p, int row, int col) {
        ArrayList<String> ans=new ArrayList<>();
        if (col == 1 || row == 1) {
            if (col == 1) for (int i=1;i< row;i ++) p=p +'D';
            if (row == 1) for (int i=1;i< col;i ++) p=p +'R';
            ans.add(p);
            return ans;
        }
        ans.addAll(arrListPath(p+'D',row-1,col));
        ans.addAll(arrListPath(p+'R',row,col-1));
        return ans;
    }
    private static ArrayList<String> arrListPathEff(String p, int row, int col) {
        ArrayList<String> ans=new ArrayList<>();
        if (col == 1 && row == 1) {
            ans.add(p);
            return ans;
        }
        if(row>1) ans.addAll(arrListPathEff(p+'D',row-1,col));
        if(col>1) ans.addAll(arrListPathEff(p+'R',row,col-1));
        return ans;
    }

    private static int countWays(int row, int col) {
        if (col == 1 || row == 1) {
            return 1;
        }
        int down=countWays(row-1,col);
        int right =countWays(row,col-1);
        int count = right + down;
        return count;
    }
}
