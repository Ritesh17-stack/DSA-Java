package Searching;

public class BinarySearch {

    public static int binarysearch(int arr[], int n, int k) {
        int left  = 0;
        int right = n-1;
        while(left<=right){
          int mid = left+ (right-left)/2;
          
          if(arr[mid]==k){
            return mid;
          }
          if(arr[mid]<k){
            left=mid+1;
          }
          else
            right = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int ans = binarysearch(arr, 6, 6);
        if (ans == -1) {
            System.out.println("Not present");
        }
        else
        System.out.println("Element is present at index: "+ans);
    }
}



