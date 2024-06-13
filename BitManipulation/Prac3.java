package BitManipulation;

import java.util.Scanner;

// Write a program to count the number of 1’s in a binary representation of the number
public class Prac3 {
    public static void countOnes(int n){
        int count = 0;
        while (n>0) {
            count+=n & 1; 
            n=n>>1;
        }
        System.out.println("1's in n = "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        countOnes(n);
    }
}
