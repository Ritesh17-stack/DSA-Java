package Recursion;
import java.util.*;
public class Prac5 {
    public static ArrayList<Integer> range(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index==arr.length) {
            return list;
        }
        if (arr[index]==target) {
            list.add(index);
        }
        ArrayList<Integer> ansfromBelowCalls=(range(arr,target,index+1));
        list.addAll(ansfromBelowCalls);
        return list;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,5};
        System.out.println(range(arr, 4, 0));

    }
}
