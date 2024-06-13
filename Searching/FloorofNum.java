package Searching;

public class FloorofNum {
    public static int findFloor(int[] arr,int target){
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
        return end;
    }
    public static void main(String[] args){
        int arr[]={-18,12,-4,0,4,5,17,19,20,22,24};
        int target = -19;
        int ceilingIndex =findFloor(arr, target);
        System.out.println(ceilingIndex);
        if (ceilingIndex== -1) {
            System.out.println("-1");
        }
        else
        System.out.println("The ceiling of "+target+" is "+ arr[ceilingIndex]);
    }
}
