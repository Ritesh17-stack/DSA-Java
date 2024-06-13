package BitManipulation;
// Write a program to toggle a bit a position = “pos” in a number “n”.

import java.util.Scanner;

public class Prac2 {
    public static int bitToggle(int n,int pos){
        int mask=1<<pos;
        return n^mask;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the position");
        int pos = sc.nextInt();
        int result = bitToggle(n,pos);
        System.out.println(result);
    }
}
