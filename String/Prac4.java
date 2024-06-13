package String;

import java.util.Scanner;

// Print the spiral order matrix as output for a given matrix of numbers. 
public class Prac4 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix(n,m)");
        n=sc.nextInt();
        m=sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("Enter the matrix value at positions: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("["+i+"]"+"["+j+"] : ");
                matrix[i][j]=sc.nextInt();
            } 
        }
        System.out.println("This is the original matrix ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("|  "+matrix[i][j]+"  |");
            } 
            System.out.println();
        }
        System.out.println("Here is the spriral printing: ");
        int row_start=0;
        int row_end=n-1;
        int col_start=0;
        int col_end=m-1;   

     while (row_start<=row_end && col_start<=col_end) {
        for (int col = col_start;col<=col_end ; col++) {
            System.out.print(matrix[row_start][col]+" ");
        }
        row_start++;
        for(int row=row_start;row<=row_end;row++){
            System.out.print(matrix[row][col_end]+" ");
        }
        col_end--;
        for(int col=col_end;col>=col_start;col--){  
            System.out.print(matrix[row_end][col]+" ");
        }
        row_end--;
        for(int row=row_end;row>=row_start;row--){
            System.out.print(matrix[row][col_start]+" ");
        }
        col_start++;
        System.out.println();
     }
    }
}
