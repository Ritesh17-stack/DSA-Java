package Recursion;
// Print x^n (Memory stack height = n)
import java.util.Scanner;

public class Prac2 {
    public static int calc_power(int x,int n) {
        if (x==1|| n==0) {
            return 1;
        }
        return x*calc_power(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and exponent : ");
        int x,n;
        x=sc.nextInt();
        n=sc.nextInt();
        System.out.println("The soln is : "+calc_power(x, n));
    }
    
}
