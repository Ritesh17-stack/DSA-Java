package Recursion;
// Print all permutations of a given string 
import java.util.Scanner;

public class Permutation {
    public static void calcPermutation(String str,String permutation){
        if (str.length()==0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
        char currChar=str.charAt(i);
        String newStr=str.substring(0,i)+str.substring(i+1);
        calcPermutation(newStr,permutation+currChar);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.next();
        calcPermutation(str, "");
    }
    
}