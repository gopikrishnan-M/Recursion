package Recursion.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board={{8,3,0,0,7,0,0,0,0}
,{6,0,0,1,9,5,0,0,0}
,{0,9,8,0,0,0,0,6,0}
,{8,0,0,0,6,0,0,0,3}
,{4,0,0,8,0,3,0,0,1}
,{7,0,0,0,2,0,0,0,6}
,{0,6,0,0,0,0,2,8,0}
,{0,0,0,4,1,9,0,0,5}
,{0,0,0,0,8,0,0,7,9}};
        if(sudoko(board)){
            printS(board);
        }
        else {
            System.out.println("the board cannot be solved");
        }
    }

    public static boolean sudoko(int[][] board){
        int row=-1;
        int col=-1;
        boolean hasEmpty=false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    hasEmpty=true;
                    break;
                }
            }
            if (hasEmpty) {
                break;
            }
        }
        if (!hasEmpty) {
            return true;
        }
        for (int i = 1; i <= 9; i++) {
            if(isSCorrect(board,i,row,col)){
                board[row][col]=i;
                if(sudoko(board)){
                    return true;
                }
                board[row][col]=0;
            }
        }
        return false;
    }

    private static void printS(int[][] board) {
        for(int[] arr:board){
            for (int num:arr){
                System.out.print(num+"  ");
            }
            System.out.println();
        }
    }


    public static boolean isSCorrect(int[][] board,int num, int row ,int col){
        for(int i=0; i< board.length; i++){
            if(board[row][i]==num){
                return false;
            }
        }
        for(int[] arr:board){
            if(arr[col]==num){
                return false;
            }
        }

        int root=(int)Math.sqrt(board.length);
        int rowStart=row-row%root;
        int colStart=col-col%root;
        for (int i=rowStart;i< rowStart+root ;i++){
            for (int j=colStart ;j< colStart+root ;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
}
