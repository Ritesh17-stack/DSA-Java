package Searching;

public class LinearSearch {
    // public static int search(int[] arr,int target){
    //     for (int i = 0; i < arr.length; i++) {
    //         if (target==arr[i]) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // 
    public static int search(int arr[], int target,int idx){
            if (idx>=arr.length) {
                return -1;
            }
            if (arr[idx]==target) {
                return idx;
            }
            return search(arr,target,idx+1);
            

        }
            
    public static void main(String[] args) {
        int arr[]={5,7,35,88,56};
        int ans = search(arr,88,0);
        if (ans==-1) {
            System.out.println("Element not present");
        }
        else
        System.out.println("Element is present at index: "+ans);
    }
}
