package Recursion;

public class ReverseNum {
    public static int helper(int n,int digits){
        if (n%10==n) {
            return n;
        }
        return (n%10)*(int)Math.pow(10, digits-1) + helper(n/10, digits-1);

    }
    public static int reverse(int n){
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }
    public static void main(String[] args) {
        int n =1234;
        System.out.println(reverse(n));

    }
}
