package Recursion;

public class SumofDigits {
    public static int sumofDigits(int n){
        if (n==0) {
            return 1;
        }
        return (n%10)+sumofDigits(n/10);
    }
    public static void main(String[] args) {
        int n =1111;
        System.out.println(sumofDigits(n));
    }
    
}