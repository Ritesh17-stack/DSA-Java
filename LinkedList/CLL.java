package LinkedList;

public class CLL {
    private Node head;
    private Node tail;
    public CLL(){
        head = null;
        tail= null;
    }

    private class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data = data;
        }
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail =newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
    }
    public void delete(int data){
        Node newNode = head;
        if (newNode == null) {
            System.out.println("The list is empty");
            return;
        }    
        if (newNode.data == data) {
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n = newNode.next;
            if (n.data==data) {
                newNode.next=n.next;
                break;
            }
            newNode=newNode.next;
        }while(newNode!=head);
    }
    public void display(){
        if (head==null) {
            System.out.println("The List is empty.");
            return;
        }
        Node temp=head;
        do {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("head");
    }
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        list.delete(5);
        list.display();
    }

}