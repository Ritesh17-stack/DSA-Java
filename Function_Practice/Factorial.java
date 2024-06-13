package Function_Practice;

import java.util.*;
public class Factorial {
    public static int Fact(int n){
        if (n==1||n==0) {
            return 1;
        }
        return n*Fact(n-1);
    
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        System.out.println(Fact(n));

    }
}
