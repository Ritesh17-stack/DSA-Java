package LinkedList;

public class DLL {
    int size;
    DLL(){
        this.size = 0;
    }
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(){}
        Node(int data){this.data=data;}
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    public Node find(int data){
        if (head==null) {
            return null;
        }
        Node temp=head;
        while (temp!=null) {
            if (temp.data==data) {
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void insertAfter(int after, int data){
        Node p =  find(after);
        Node newNode = new Node(data);
        if (head ==null) {
            System.out.println("The list is empty");
        }
        newNode.next=p.next;
        p.next=newNode;
        newNode.prev=p;
        if (newNode.next!=null) {
            newNode.next.prev=newNode;
        }
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        newNode.prev=null;
        size++;
        if (head!=null) {
            head.prev=newNode;
        }
        head=newNode;
    }
    public void insertLast(int data){
        Node newNode = new Node(data);
        newNode.next=null;
        Node last = head;
        size++;
        if (head == null) {
            head = newNode;
        }
        while (last.next!=null) {
            last=last.next;
        }
        last.next=newNode;
        newNode.prev=last;
    }
    public void insertAtIndex(int data , int idx){
        if (idx==0) {
            insertFirst(data);
            return;
        }
        if (idx==size) {
            insertLast(data);
            return;
        }
        Node temp = head;
        for(int i = 1; i< idx ; i++){
            temp=temp.next;
        } 
        Node newNode = new Node(data);
        newNode.next=temp.next;
        newNode.prev = temp;
        if (temp.next!=null) {
            temp.next.prev = newNode;
        }
        temp.next=newNode;

    }
    public void deleteFirst(){
        if (head == null ) {
            System.out.println("The list is empty");
            return; 
        }
        size--;
        head=head.next;
        head.prev=null;
    }
    public void deleteLast(){
        if (head == null ) {
            System.out.println("The list is empty");
            return; 
        }
        Node temp = head;
        size--;
        if (temp.next==null) {
            head =null;
            return;
        }
        while (temp.next.next!=null) {
            temp=temp.next;            
        }
        temp.next.prev = null;
        temp.next=null;
    }
    public void deleteAtIndex(int idx){
        if (head==null) {
            System.out.println("The list is empty");
            return;
        }
        if (idx==0) {
            deleteFirst();
            size--;
            return;
        }
        if (idx==size-1) {
            deleteLast();
            size--;
            return;
        }
       Node currNode=head;
       Node prevNode=null;
       for (int i = 0; i < idx ; i++) {
            prevNode=currNode;
            currNode=currNode.next;
       }
      
       prevNode.next=currNode.next;
       currNode.next.prev=prevNode;
       currNode=null;
       size--;
    }
    public void display(){
        if (head==null) {
            System.out.println("The list is empty");
            return;
        }
        Node temp =head;
        // Node last = null;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            // last=temp;
            temp=temp.next;
        }
        System.out.println("Null");

        // System.out.println("Reverse: ");
        // while (last!=null) {
        //     System.out.print(last.data+"->");
        //     last=last.prev;
        // }
        // System.out.println("Null");
    }
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(1);
        list.insertFirst(13);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(2);
        list.insertLast(100);
        // list.display();
        // list.insertAtIndex(5,1 );
        // list.display();
        // list.insertAfter(100, 10);
        // list.display();
        list.display();
        // list.deleteFirst();
        // list.deleteLast();
        // list.display();
        list.deleteAtIndex(5);
        list.display();
    }

}
