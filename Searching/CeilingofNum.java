package Searching;

public class CeilingofNum {
    //Ceiling is the largest number>= target
    public static int findCeiling(int[] arr,int target){
        if (target>arr[arr.length-1]) {
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start +(end - start)/2;
            if (arr[mid]==target) {
                return mid;
            }
            if (arr[mid]<target) {
                start = mid+1;
            }
            else
                end = mid -1;
        }
        return start;
    }
    public static void main(String[] args){
        int arr[]={-18,12,-4,0,4,5,17,19,20,22,24};
        int target = 24;
        int ceilingIndex =findCeiling(arr, target);
        if (ceilingIndex==-1) {
            System.out.println("-1");
        }
        else
        System.out.println("The ceiling of "+target+" is "+ arr[ceilingIndex]);
    }
}