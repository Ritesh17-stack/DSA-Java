package BitManipulation;

import java.util.Scanner;

// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.
public class Prac4 {
    public static void decimal2binary(int n){
        String str="";
        while (n>0) {
            if ((n&1)==1) {
                str+=1;
            }
            else
            str+=0;
           n>>=1; 
        }
        System.out.println("The binary number is : ");
        for (int i = str.length()-1; i>= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
    public static void binary2decimal(int n){
        int deci=0;
        int base=1;
        int temp =n;
        int lastdigit;
        while (temp>0) {
            lastdigit=temp%10;
            temp=temp/10;
            deci+=lastdigit*base;
            base*=2;
        }
        System.out.println("The decimal number is : "+deci);

    }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the value of n");
         int n=sc.nextInt();
        //  decimal2binary(n);
         binary2decimal(n);
    }   
}
