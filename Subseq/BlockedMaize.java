package Recursion.Subseq;

import java.util.ArrayList;

public class BlockedMaize {
    public static void main(String[] args) {
        boolean [][]board ={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
       // System.out.println(blockOvercome("",0,0,board));
        System.out.println(allDirectionList("",0,0,board));
    }

    private static ArrayList<String> blockOvercome(String p, int row, int col, boolean[][] board) {
        ArrayList<String> ans=new ArrayList<>();
        if (col == board[0].length-1 && row == board.length-1) {
            ans.add(p);
            return ans;
        }
        if (!board[row][col]) return ans;
        if(row < board.length-1) ans.addAll(blockOvercome(p+'d',row+1,col,board));
        if(col < board[0].length-1) ans.addAll(blockOvercome(p+'r',row,col+1,board));
        return ans;
    }

    private static void allDirection(String p, int row, int col, boolean[][] board) {

        if (col == board[0].length-1 && row == board.length-1) {
            System.out.println(p);;
            return;
        }
        if (!board[row][col]) return;//checks the path is blocked or not
        board[row][col]=false;//if the path is not blocked then mark it as false as we visit one by one
        if(row < board.length-1) allDirection(p+'D',row+1,col,board);
        if(col < board[0].length-1) allDirection(p+'R',row,col+1,board);
        if(col >0) allDirection(p+'L',row,col-1,board);
        if(row >0) allDirection(p+'U',row-1,col,board);
        //after we complete visiting a path and reach the destionation the control will be returned to its previous call
        //we must clear the chages that were made during a recursion call (it should be like what if this path wasn't choosen)
        // so after completing a path or returning the control back to previous call change the visited cell to true;
        board[row][col]=true;
    }


    private static ArrayList<String> allDirectionList(String p, int row, int col, boolean[][] board) {
        ArrayList<String> ans=new ArrayList<>();
        if (col == board[0].length-1 && row == board.length-1) {
            ans.add(p);
            return ans;
        }
        if (!board[row][col]) return ans;//checks the path is blocked or not
        board[row][col]=false;//if the path is not blocked then mark it as false as we visit one by one
        if(row < board.length-1) ans.addAll(allDirectionList(p+'D',row+1,col,board));
        if(col < board[0].length-1) ans.addAll(allDirectionList(p+'R',row,col+1,board));
        if(col >0) ans.addAll(allDirectionList(p+'L',row,col-1,board));
        if(row >0) ans.addAll(allDirectionList(p+'U',row-1,col,board));
        //after we complete visiting a path and reach the destionation the control will be returned to its previous call
        //we must clear the chages that were made during a recursion call (it should be like what if this path wasn't choosen)
        // so after completing a path or returning the control back to previous call change the visited cell to true;
        board[row][col]=true;
        return ans;
    }
}
