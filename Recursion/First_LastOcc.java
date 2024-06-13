package Recursion;

import java.util.Scanner;
//Find the first and last occurence of an element
public class First_LastOcc {
    public static int first  = -1;
    public static int last = -1;
    public static void findOccurence(String str,int idx,char c){
        if (idx==str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (str.charAt(idx)==c) {
            if (first==-1) {
                first=idx;
            }
            else
            last=idx;
        }
        findOccurence(str, idx+1, c);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("Enter the element to find: ");
        char c = sc.next().charAt(0);
        findOccurence(str, 0, c);

    }
}
