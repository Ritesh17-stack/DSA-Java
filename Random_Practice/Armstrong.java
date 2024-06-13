package Random_Practice;

import java.util.Scanner;


public class Armstrong{
    public static boolean isArmstrong(int num){
        int no_of_dig = String.valueOf(num).length();
        int n = num;
        int sum= 0;
        while (n>0) {
            sum = sum + (int)Math.pow(n%10,no_of_dig);
            n/=10;
        }
        if(num==sum) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Yes");
        }
        else System.out.println("False");
    }
}
