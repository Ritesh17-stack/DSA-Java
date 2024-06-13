package String;
// Q2Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String str = new String();       
        str=sc.nextLine();
        String result = new String();
        result=str.replace('e', 'i');
        System.out.println(result);
    }   
}