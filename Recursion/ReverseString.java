package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void revString(String str){
        if (str.length()==0) {
            return;
        }
        System.out.print(str.charAt(str.length()-1));
        revString(str.substring(0, str.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.next();
        revString(str);
    }
}
