package Recursion.Backtracking;

class EffSudokuSolve {
    public static void main(String[] args) {
        char[][] board= {
        {'.','.','.','.','5','4','3','2','1'},
        {'.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.'}};
        System.out.println(solveSudoku(board));
    }
    public static boolean solveSudoku(char[][] board) {
        int n =board.length;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(board[row][col]=='.'){
                    for(char i='1';i<='9';i++){
                        if(isCorrect(i,board,row,col)){
                            board[row][col]=i;
                            if(solveSudoku(board)){
                                return true;
                            }
                            board[row][col]='.';
                        }
                    }
                    return false;
                }
            }

        }
     return true;
    }

    private static boolean isCorrect(char num,char[][] board,int row,int col){
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num|| board[i][col]==num){
                return false;
            }
        }
        int root=(int) Math.sqrt(board.length);
        int rowStart=row-row%root;
        int colStart=col-col%root;
        for(int i=rowStart; i< rowStart+root ;i++){
            for(int j=colStart; j< colStart + root ;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        
        return true;
    }
}