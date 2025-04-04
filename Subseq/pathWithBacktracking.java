package Recursion.Subseq;

import java.util.Arrays;

public class pathWithBacktracking {
    public static void main(String[] args) {
        boolean [][]board ={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] p=new int[board.length][board[0].length];
        pathPrinter(p,0,0,board,1);
    }

    private static void pathPrinter(int[][] p, int row, int col, boolean[][] board,int count) {
        if (col == board[0].length-1 && row == board.length-1) {
            p[row][col]=count;
            for (int[] arr:p){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("*******************");

            return;
        }
        if (!board[row][col]) return;//checks the path is blocked or not

        board[row][col]=false;//if the path is not blocked then mark it as false as we visit one by one
        p[row][col]=count;
        if(row < board.length-1) {
            pathPrinter(p,row+1,col,board,count+1);
        }
        if(col < board.length-1) {
            pathPrinter(p,row,col+1,board,count+1);
        }
        if(col > 0) {
            pathPrinter(p,row,col-1,board,count+1);
        }
        if(row > 0) {
            pathPrinter(p,row-1,col,board,count+1);
        }

        //after we complete visiting a path and reach the destionation the control will be returned to its previous call
        //we must clear the chages that were made during a recursion call (it should be like what if this path wasn't choosen)
        // so after completing a path or returning the control back to previous call change the visited cell to true;
        board[row][col]=true;
        p[row][col]=0;
    }

}
