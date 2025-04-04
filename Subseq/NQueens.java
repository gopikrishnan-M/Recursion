package Recursion.Subseq;

public class NQueens {
    public static void main(String[] args) {
        int size=4;
        boolean [][]board =new boolean[size][size];
        queens(board,0);
    }
    public static int queens(boolean[][] board,int row){
        if (row == board.length ) {
            displayChess(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col<board.length;col++){
            if(isCorrect(board,row,col)){
                board[row][col]=true;
                count=count+queens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    private static boolean isCorrect(boolean[][] board, int row, int col) {
        for (int i=0;i<board.length;i++){
            if(board[i][col])
                return false;

        }

        int leftMax=Math.min(row,col);

        for (int i=1;i<=leftMax;i++){
            if(board[row-i][col-i])
                return false;

        }

        int rigthMax=Math.min(row,board.length-col-1);

        for(int i=1;i<=rigthMax;i++){
            if (board[row-i][col+i])
                return false;

        }

        return true;
    }

    private static void displayChess(boolean[][] board) {
        for (boolean[] arr:board){
            for (boolean element: arr){
                if (element) {
                    System.out.print(" Q ");
                }
                else {
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("****************");
    }

}
