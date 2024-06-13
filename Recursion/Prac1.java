package Recursion;

import java.util.Scanner;

// Q1 Print sum of n natural numbers
public class Prac1 {
    public static int getSum(int n){
        if (n==0||n==1) {
            return n;
        }
        return n+getSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.err.println("The sum of first "+n+" natural numbers is :"+getSum(n));
    }
}
