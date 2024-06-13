package Recursion;

import java.util.Scanner;

public class Subsequence {
    public static void calc_subseq(String str, int idx,String newString){
        if (idx==str.length()) {
            System.out.println(newString);
            return;
        }
        //To be in string
        calc_subseq(str, idx+1, newString+str.charAt(idx));
        //Not to be
        calc_subseq(str, idx+1, newString);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.next();
        calc_subseq(str, 0, "");
    }
}
