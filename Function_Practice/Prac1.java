package Function_Practice;
// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.*;
public class Prac1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ctrp=0;
        int ctrn=0;
        int ctrz=0;
        int n;
        while (true) {
            System.out.println("Enter the number(press -1 for exit.)");
            n=sc.nextInt();
            if (n==-1) {
                break;
            }
            if (n>0)
                ctrp++;
            
            else if(n<0)
                ctrn++;

            else if(n==0)
                ctrz++;
            else {
                System.out.println("Enter a valid number");
                return;
            }    
        }
        System.out.println("The no of positive numbers are : "+ctrp);
        System.out.println("The no of negative numbers are : "+ctrn);
        System.out.println("The no of zeroes are : "+ctrz);
    }
}
