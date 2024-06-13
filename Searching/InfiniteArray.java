package Searching;

public class InfiniteArray {
    public static int ans(int[] arr,int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // Condition for the target to lie in the range
        while(arr[end]<target){
            int newStart=end+1;
            end = end+ 2*(end-start+1); 
            start = newStart;
        }
        return binarysearch(arr, target, start, end);

    }


    public static int binarysearch(int arr[], int target, int start,int end ) {
        while(start<=end){
          int mid = start+ (end-start)/2;
          
          if(arr[mid]==target){
            return mid;
          }
          if(arr[mid]<target){
            start=mid+1;
          }
          else
            end = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={0,1,3,44,57,59,77,78,91,98,99,101,115,117,119,120};
        int result = ans(arr,117);
        if (result==-1) {
            System.out.println("Element not present");
        }
        else
        System.out.println("The element is present at index: "+result);

    }
}
