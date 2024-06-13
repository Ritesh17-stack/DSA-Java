package Recursion;

import java.util.ArrayList;

public class SubsetofN {
    public static void printSubset(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void calcSubset(int n, ArrayList<Integer> subset){
        if (n==0) {
            printSubset(subset);
            return;
        }
        // If added
        subset.add(n);
        calcSubset(n-1, subset);
        //If not added
        subset.remove(subset.size()-1); 
        calcSubset(n-1, subset);

    }
    public static void main(String[] args){
        int n =4;
        ArrayList<Integer> subset=new ArrayList<>();
        calcSubset(n,subset);
        
    }
}
