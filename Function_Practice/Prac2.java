package Function_Practice;
// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.*;
public class Prac2 {
    public static double exponent(int x, int n){
        if (n==0) {
            return 1;
        }
        return x*exponent(x, n-1);
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n,x;
        System.out.println("Enter the value of x");
        x=sc.nextInt();
        System.out.println("Enter the value of y");
        n=sc.nextInt();
        System.out.println("x^n = "+exponent(x, n));
    }
}
