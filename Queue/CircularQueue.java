package Queue;

public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front=0;
    protected int end =0;
    private int size =0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if (isFull()) {
            return false;
        }
        data[end++]=item;
        end = (end%data.length) ;
        size++;
        return true;
    } 
    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("The queue is empty");
        }
        int removed = data[front++];
        front=(front%data.length);
        size--;
        return removed;
    }
    public int Front()throws Exception{
        if (isEmpty()) {
            throw new Exception("The queue is empty");
        }
        return data[front];
    }
    public void display(){
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
       int i = front;
       do{
            System.out.print(data[i]+"->");
            i++;
            i%=data.length;
        }while(i!=end);
        System.out.print("END");
    }
    public static void main(String[] args) throws Exception {
        CircularQueue cQueue  = new CircularQueue(5);
        cQueue.insert(1);
        cQueue.insert(2);
        cQueue.insert(3);
        cQueue.insert(4);
        cQueue.insert(5);
        cQueue.display();
    }
}
