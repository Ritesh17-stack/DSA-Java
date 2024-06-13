package Recursion;
import java.util.*;
public class NQueens {
    public static boolean isSafe(int row,int col,char board[][]){
        // horizontally
        for(int c=0;c<board.length;c++){
            if (board[row][c]=='Q') {
                return false;
            }
        }
        // vertically
        for (int r=row;r<board.length; r++) {
            if (board[r][col]=='Q') {
                return false;
            }
        }
        // upperLeft
        for(int r=row,c=col;r>=0 &&c>=0;r--,c--){
            if (board[r][c]=='Q') {
                return false;
            }
        }
        // downright
        for(int r=row,c=col; r<board.length && c <board.length ; r++, c++){
            if (board[r][c]=='Q') {
                return false;
            }
        }
        // upper right
        for(int r=row,c=col; r>=0 && c <board.length; r--, c++){
            if (board[r][c]=='Q') {
                return false;
            }
        }
        // downleft
        for(int r=row,c=col; r<board.length && c >= 0; r++, c--){
            if (board[r][c]=='Q') {
                return false;
            }
        }
        return true;
    }
    public static void saveBoard(char[][] board,List<List<String>> allBoards){
        String row="";
        List<String> newBoard=new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row="";
            for(int j =0;j<board[0].length;j++){
                if (board[i][j]=='Q') {
                   row+='Q';
                }
                else
                row+='.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public static void helper(char board[][],List<List<String>> allBoards,int col){
        if (col==board.length) {
            saveBoard(board,allBoards);
        }
        for(int row = 0; row<board.length;row++){
            if (isSafe(row,col,board)) {
                board[row][col]='Q';
                helper(board, allBoards, col+1);
                board[row][col]='.';
            }   
        }
    }
    public static List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards=new ArrayList<>();
        char[][] board= new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }
    public static void main(String args[]){
        int n =4;
        List<List<String>> allBoards =solveNQueens(n);
        for (int i = 0; i < allBoards.size(); i++) {
            System.out.println(allBoards.get(i));
            System.out.println();
        }
    }
        
}
