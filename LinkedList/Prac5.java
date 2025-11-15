package LinkedList;

public class Prac5 {
    int size;
    Prac5(){
        this.size = 0;
    } 
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){this.data=data;}
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    public Node find(int data){
        if(head==null){
            return null;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void insertAfter(int after, int data){
        if(head==null){
            System.out.println("The list is empty");
        }
        Node p = find(after);
        Node newNode = new Node(data);
        newNode.next=p.next;
        p.next=newNode;
        newNode.prev=p;
        if(newNode.next!=null){
            newNode.next.prev = newNode;
        }
        size++;
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev=null;
        size++;
        if(newNode.next!=null){
            newNode.next.prev=newNode;
        }
        head=newNode;
    }
    public void insertLast(int data){
        Node newNode = new Node(data);
        newNode.next = null;
        Node last = head;
        size++;
        if(head == null){
            head = newNode;
        }
        while (last.next!=null) {
            last=last.next;
        }
        last.next = newNode;
        newNode.prev=last;
        size++;
    }
    public void insertIndex(int index,int data){
        if(index ==0){
            insertFirst(data);
        }
        if(index==size-1){
            insertLast(data);
        }
        Node temp = head;
        for(int i =1; i<index;i++){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;
        if(temp.next!=null){
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        size++;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.prev=null;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
        }
        Node temp = head;
        size--;
        if(temp.next==null){
            head = null;
            return;
        }
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.prev.next=null;
        temp.prev=null;
    }
    public void deleteIndex(int index){
        if(head==null){
            System.out.println("The list is empty");
        }
        if(index==0){
            deleteFirst();
            size--;
            return;
        }
        if(index==size-1){
            deleteLast();
            size--;
            return;
        }
        Node currNode=head;
        Node prevNode = null;
        for(int i = 0;i<index;i++){
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
            System.out.println("List is empty..");
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Prac5 list = new Prac5();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertAfter(3, 10);
        list.insertIndex(3, 9);
        list.deleteFirst();
        list.deleteLast();
        list.deleteIndex(2);
        list.display();
    }
}
