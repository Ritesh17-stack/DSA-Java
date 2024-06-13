package Searching;

public class MountainArray {
        public static int search(int[] arr,int target){
            int peak = findPeakElement(arr);
            int firstTry = orderAgnosticBS(arr, target,0,peak);
            if (firstTry!=-1) {
                return firstTry;
            }
            else
            return orderAgnosticBS(arr, target, peak+1, arr.length-1);

        }
        public static int orderAgnosticBS(int[] arr, int target,int start,int end){
            // Check whether the arr is sorted asc or desc
            boolean isAsc = arr[start]<arr[end];
            while (start<=end) {
                int mid = start + (end -start)/2;
                if (arr[mid]==target) {
                    return mid;
                }
                if (isAsc) {
                    if (target<arr[mid]) {
                        end = mid-1;
                    }
                    else{
                        start=mid+1;
                    }  
                }
                else{
                    if (target<arr[mid]) {
                        start=mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }
            }
            return -1;
        }
        public static int findPeakElement(int[] nums) {
            int start = 0;
            int end = nums.length-1;
            while(start<end){
                int mid = start + (end-start)/2;
                if(nums[mid]>nums[mid+1]){
                    end = mid;
                }
                else{
                    start = mid+1;
                }
            }
            return start;
        }

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,9,5,3,1};
            int target  = 9;
            int ans = search(arr, target);
            if (ans==-1) {
                System.out.println("The element is not present");
            }
            else{
                System.out.println("The element is present at index: "+ans);
            }
        }
        
}
