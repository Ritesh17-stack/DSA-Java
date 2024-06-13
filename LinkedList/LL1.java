package LinkedList;

public class LL1 {
    Node head;
    private int size;
    LL1(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(){}
        Node(String data){
        this.data=data; 
        }
        Node(String data,Node next){
            this.data = data;
            this.next=next;
        } 

    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }


    public void addLast(String data){
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head=newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    // Recursively insert
    public void insertRec(String data,int idx){
        head = insertRec(data, idx,head);
    }
    private Node insertRec(String data, int idx,Node node){
        if (idx==0) {
            Node newNode = new Node(data,node.next); 
            size--;
            return newNode;
        }
        node.next=insertRec(data, --idx, node.next);
        return node;

    }
    public void printList(){
        if (head==null) {
            System.out.println("The list is empty.");
            return;            
        }
        Node currNode =head;
        while (currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }


    public void deleteFirst(){
        if (head==null) {
            System.out.println("The list is empty.");
            return;           
        }
        head=head.next;
        size--;
    }


    public void deleteLast(){
        if (head==null) {
            System.out.println("The list is empty.");
            return;           
        }
        size--;
        if (head.next==null) {
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    
    public int getSize(){
        return size;

    }

    public void reverseIterarion(){
        if (head==null||head.next==null) {
            return;
        }
        Node prevNode= head;
        Node currNode=head.next;
        while (currNode!=null) {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            // Updatation
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public Node reverseRecursion(Node head){
        if (head==null||head.next==null) {
            return head;
        }
        Node newHead=reverseRecursion(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public static void main(String[] args) {
        LL1 list= new LL1();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        list.printList();
        // System.out.println("Size of the list is : "+list.getSize());
        // list.printList();
        // list.deleteFirst();
        // list.deleteLast();
        // System.out.println("Size of the list is : "+list.getSize());
        // list.printList();
        // list.reverseIterarion();
        // list.printList();
        // list.head=list.reverseRecursion(list.head);
        // list.printList();
        list.insertRec("Recursive", 0);
        list.printList();
    }
}
