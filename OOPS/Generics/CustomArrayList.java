package OOPS.Generics;

import java.util.ArrayList;

public class CustomArrayList {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    private int size = 0;

    public CustomArrayList() {
        data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int num){
        data[index]=num;
    }
    public void printList(){
        System.out.print("[");
        for(int i =0;i<size;i++){
            System.out.print(data[i]);
            if (i!=size-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();  Here integer is a generic
          CustomArrayList list = new CustomArrayList();
          list.add(5);
          list.add(6);
          list.add(7);
          list.printList();
    }

}
