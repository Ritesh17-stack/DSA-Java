package OOPS.Generics;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE=10;
    private int size = 0;

    public CustomGenericArrayList() {
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T num){
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
          CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
          list.add(5);
          list.add(6);
          list.add(7);
          list.printList();
    }

}
