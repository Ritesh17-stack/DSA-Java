package Recursion;
// Print all unique subsequent string of a given string

import java.util.Scanner;
import java.util.HashSet;
public class UniqueSubseqString {
    public static void calc_subseq(String str, int idx,String newString,HashSet<String> set){
        if (idx==str.length()) {
            if (set.contains(newString)) {
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        //To be in string
        calc_subseq(str, idx+1, newString+str.charAt(idx),set);
        //Not to be
        calc_subseq(str, idx+1, newString,set);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        System.out.println("Enter the String : ");
        String str=sc.next();
        calc_subseq(str, 0, "",set);
    }
}
