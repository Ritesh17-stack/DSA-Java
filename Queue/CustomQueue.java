package Queue;

public class CustomQueue {
    private int[] data;
    protected final int DEFAULT_SIZE = 10;
    int end = 0;
    
    private CustomQueue(){
        this.data = new int[DEFAULT_SIZE];
    }
    private CustomQueue(int size){
        this.data = new int[size];
    }

    private boolean isFull(){
        return end==data.length;
    }
    private boolean isEmpty(){
        return end==0;
    }
    public boolean insert(int item) {
        if (isFull()) {
           return false;
        }
        data[end++]=item;
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("The queue is empty cannot remove");
        }
        int removed =data[0];
        for(int i =1; i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("The queue is empty cannot remove");
        }
        return data[0];
    }
    public void display() throws Exception{
        if (isEmpty()) {
            throw new Exception("The queue is empty cannot remove");
        }
        for(int i = 0; i<end;i++){
            System.out.print(data[i]+" ");
        }
        
    }
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        // queue.display();
        queue.remove();
        // queue.display();
        System.out.println(queue.front()); 
    }

}
