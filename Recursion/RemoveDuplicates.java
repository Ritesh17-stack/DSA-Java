package Recursion;
import java.util.Scanner;
public class RemoveDuplicates {
    public static boolean map[]= new boolean[25];

    public static void removeDup(String str,int idx,String newString){
        if (idx==str.length()) {
            System.out.println(newString);
            return;
        }
        if (map[str.charAt(idx)-'a']) {
            removeDup(str, idx+1,newString);
        }
        else{
            newString+=str.charAt(idx);
            map[str.charAt(idx)-'a']=true;
            removeDup(str, idx+1, newString);        
        }

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str=sc.next();
    sc.close();
    removeDup(str, 0, "");
    }   
}
