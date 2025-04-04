package Recursion.Subseq;

import java.util.ArrayList;

public class MaizeDiagonal {
    public static void main(String[] args) {
        System.out.println(pathList("",3,3));
        System.out.println(pathList("",3,3).size());
    }

    private static ArrayList<String> pathList(String p, int row, int col) {
        ArrayList<String> ans=new ArrayList<>();
        if (row == 1 && col == 1) {
            ans.add(p);
            return ans;
        }
        if(row>1&&col>1) ans.addAll(pathList(p+'D',row-1,col-1));
        if(row>1) ans.addAll(pathList(p+'d',row-1,col));
        if(col>1) ans.addAll(pathList(p+'r',row,col-1));
        return ans;
    }
}
