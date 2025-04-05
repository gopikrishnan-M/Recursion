package Recursion.Backtracking;

public class NKnights {
    public static void main(String[] args) {
        int size=4;
        boolean [][]board =new boolean[size][size];
        knights(board,0,0,size);
        System.out.println();
    }

    private static void knights(boolean[][] board, int row, int col, int knits) {
        if (knits == 0) {
            displayKChess(board);
            System.out.println();
            return;
        }
        if(row==board.length-1 && col==board.length)  return;
        if(col==board.length){
            knights(board,row+1,0,knits);
            return;        }
        if(iskCorrect(board,row,col)){
            board[row][col]=true;
            knights(board,row,col+1,knits-1);
            board[row][col]=false;
        }

        knights(board,row,col+1,knits);
    }

    private static boolean iskCorrect(boolean[][] board, int row, int col) {
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        return true;
    }
    public static boolean isValid(boolean[][] board,int row ,int col){
        if(row>=0 && row<board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }

    private static void displayKChess(boolean[][] board) {
        int i=0;
        for (boolean[] arr:board){
            for (boolean element: arr){
                i++;
                if (element) {
                    System.out.print("🐴");
                }
                else {
                    if((i&1)==1)
                        System.out.print("⬜");
                    else
                        System.out.print("⬛");
                }
            }
            System.out.println();
            if((board.length&1)!=1)
                i++;
        }
        System.out.println();
        System.out.println("****************");
    }
}
