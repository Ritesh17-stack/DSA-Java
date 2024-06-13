package Recursion;
// Check if the numbers are in strictly increasing order of not.  
// 1 2 3 4✅
//1 2 3 3 4❌
import java.util.Scanner;

class StrictlyIncr {
    public static boolean checkStrInc(int arr[],int idx){
        if (idx==arr.length-1) {
            return true;
        }
        if (arr[idx]>=arr[idx+1]) {
            // array is sorted till now
            return false;
        }
        else
        return checkStrInc(arr, idx+1);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println();
        System.out.println("Enter the value in array");
        int arr[]=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(checkStrInc(arr, 0));
    
    }
}