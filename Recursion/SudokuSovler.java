package Recursion;
class SudokuSolver{
    public static boolean isSafe(char[][] board,int row,int col,int num){
        for (int i = 0; i < board.length; i++) {
            //row
            if (board[row][i]==(char)(num+'0')) {
                return false;
            }
            //column
            if (board[i][col]==(char)(num+'0')) {
                return false;
            }
            //grid
            int sr=(row/3) * 3;
            int scol=(col/3) * 3;
            for (int j=sr; j < sr+3; j++) {
                for (int k = scol; k < scol+3; k++) {
                    if(board[j][k]==(char)(num+'0'))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean helper(char[][] board,int row,int col){
        if (row==board.length) {
            return true;
        }
        int ncol=0;
        int nrow=0;
        if (col!=board.length-1) {
            ncol=col+1;
            nrow=row;
        }
        else{
            ncol=0;
            nrow=row+1;
        }
        if (board[row][col]!='.') {
            if (helper(board,nrow,ncol)) {
                return true;
            } 
        }
        else{
            for (int i = 1; i <= board.length; i++) {
                if (isSafe(board,nrow,ncol,i)) {
                    board[row][col]=(char)(i+'0');
                    if (helper(board,nrow,ncol)) {
                        return true;
                    }
                    else{
                        board[row][col]='.';
                    }
                }
            }
        }
        return false;
    }

    public static void solveSudoku(char[][] board){
       helper(board,0,0);
       for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board=   {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                          {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                          {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                          {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                          {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                          {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                          {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                          {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                          {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
         };
        solveSudoku(board);
    }
}