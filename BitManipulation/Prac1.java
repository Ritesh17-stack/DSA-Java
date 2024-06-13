package BitManipulation;
// Write a program to find if a number is a power of 2 or not.
public class Prac1 {
    public static boolean isPower(int n)
    {
        return n>0 && (n & n-1)==0;
    }
    public static void main(String[] args) {
        int n =100;
        if (isPower(n)) {
            System.out.println("The no is power of n.");
        }
        else{
            System.out.println("The number is not the power of n");
        }

    }
}
