package String;
// Q.Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the size of array");
       int size=sc.nextInt();
       sc.nextLine();//This consumes the new line character after pressing enter in the above int scanner
       String array[]=new String[size];
       System.out.println("Enter the string in the array: ");
       for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextLine();
       }
       int count=0;
       for (int i = 0; i < array.length; i++) {
            count+=array[i].length();
       }
       System.out.println("The length of the array is : "+count);
    }
    
}
