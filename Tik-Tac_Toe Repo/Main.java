import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Creating Board
    char[][] board = new char[3][3];
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = ' ';
      }
    }
    // There will be two players 'X' & 'O'
    char player = 'X';
    boolean gameOver = false;
    Scanner sc = new Scanner(System.in);
      printBoard(board);
    while (!gameOver) {
      System.out.println("Player "+ player+" Enter : ");
      int row = sc.nextInt();
      int col = sc.nextInt();
      
      if(board[row][col]==' '){
        board[row][col]= player;
        // haveOne function will check all the winning possibilties for current player
        gameOver = haveWon(board,player);
        if(gameOver){
          System.out.println("Player "+player+" has Won!!");
        }
        else{
          player = (player=='X')?'O':'X';
        }
      }
      else{
        System.out.println("Invalid Move, Try Again!!");
      }
      printBoard(board);
    }
    sc.close();
  }
  public static boolean haveWon(char[][] board, char player){
    // check for row
    for(int row = 0; row<board.length;row++){
      if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
        return true;
      }
    }
    // check for col
    for(int col = 0; col<board.length;col++){
      if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
        return true;
      }
    }
    // check for diagonal
    if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
      return true;
    }   
    return false;
  }

  public static void printBoard(char[][] board){
    for(int row = 0; row<board.length;row++){
      for(int col = 0; col<board[row].length;col++){
        System.out.print(board[row][col]);
        if (col!=2) {
            System.out.print(" | ");
        }
      }
      System.out.println();
    }
  }
}
