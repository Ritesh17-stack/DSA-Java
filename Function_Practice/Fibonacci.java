package Function_Practice;
// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

public class Fibonacci {
    public static int Fib(int n){
        if (n<=1) {
            return n;
        }
        return Fib(n-1)+Fib(n-2);
    }
    public static void main(String[] args) {
        System.out.print("Fibonacci Series : ");
        int n=10;
        for (int i = 0; i <=n; i++) {
            System.out.print(Fib(i));
            if (i==n) {
                break;
            }
            System.out.print(",");
        }
        Fib(n);
    }
}
