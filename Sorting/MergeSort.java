package Sorting;

public class MergeSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    } 
    
    public static void conquer(int arr[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int i=0;
        while (idx1<=mid && idx2<=ei) {
            if (arr[idx1]<arr[idx2]) {
                merged[i++]=arr[idx1++];
            }
            else{
                merged[i++]=arr[idx2++];
            }
        }
        while (idx1<=mid) {
            merged[i++]=arr[idx1++];

        }
        while (idx2<=ei) {
            merged[i++]=arr[idx2++];
        }
        for(int j=0,k=si;j<merged.length;j++,k++){
            arr[k]=merged[j];
        }
    }
    
    public static void divide(int arr[],int si,int ei){
        if (si>=ei) {
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        printArr(arr);
        divide(arr,0,arr.length-1);
        System.out.println();
        printArr(arr);
    
    }
}
