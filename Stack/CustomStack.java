package Stack;

public class CustomStack {
    protected int [] data;
    private static final int DEFAULT_SIZE =10;
    int top = -1;

    public CustomStack(){
        this.data = new int[DEFAULT_SIZE];
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    private boolean isFull(){
        return top==data.length-1;
    }
    private boolean isEmpty(){
        return top==-1;
    }

    public boolean push(int item){
        if(isFull()){
            return false;
        }
        top++;
        data[top]=item;
        return true;
    }  
    public int pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("The stack is empty.");
        }

        return data[top--];
    }
    public int peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("Cannot peek from an empty stack.");
        }      
        return data[top];
    }
    public static void main(String[] args) throws Exception {
     CustomStack stack =new CustomStack(5);
     stack.push(5);
     stack.push(6);   
     stack.push(7);   
     stack.push(8);
     stack.push(9);
     System.out.println(stack.peek());
     System.out.println(stack.pop());
     System.out.println(stack.isFull());
     System.out.println(stack.push(10));
     System.out.println(stack.isFull());

    }
    
}
