package Function_Practice;
// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
import java.util.*;

public class Prac3 {
    public static int gcd(int a , int b){
        int temp=0;
        if (a<b) {
            for (int i = 1; i <= a; i++) {
                if (a % i==0 && b % i ==0 ) {
                    temp=i;
                }
            }           
        }
        else
        for (int i = 1; i <= b; i++) {
            if (a % i==0 && b % i ==0 ) {
                temp=i;
            }
        }          
        return temp;
    }
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("The the two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("The gcd of "+a+" & "+b+" = "+gcd(a, b));
    }
    
}
