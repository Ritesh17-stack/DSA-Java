package Sorting;

public class InsertionSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,2,1};
        printArr(arr);
        insertion_sort(arr);
        System.out.println();
        printArr(arr);
    }
}
