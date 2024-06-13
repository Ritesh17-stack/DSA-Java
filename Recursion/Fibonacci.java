package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void calc_fib(int a,int b,int n) {
        if (n==0) {
            return;
        }
        int c=a+b;
        System.out.println(c);
        calc_fib(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println("Enter the length for fibonacci : ");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        calc_fib(a,b,n-2);
    }
}
