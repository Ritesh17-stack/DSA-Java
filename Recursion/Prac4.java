package Recursion;
// Shift all the x at the rightmost of the string
import java.util.Scanner;

public class Prac4 {
    public static void Move_x(String str,int idx,int count,String newString){
        if (idx==str.length()) {
            for (int i = 0; i <count; i++) {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(idx)=='x') {
            count++;
            Move_x(str, idx+1, count, newString);
        }
        else{
        newString+=str.charAt(idx);
        Move_x(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.next();
        Move_x(str, 0, 0, "");
    }
    
}
