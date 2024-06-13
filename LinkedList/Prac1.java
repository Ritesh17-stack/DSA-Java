package LinkedList;
import java.util.*;
// Q1. Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
// Q2. Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

public class Prac1 {
    int count;
    Node head;
    Prac1(){
        this.count=0;
        this.head=null;
    }
    class Node{
        int data;
        Node next;
        private Node(int data){
            this.data=data;
            this.next=null;
        } 
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void printList(){
        if (head==null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    // Q2
    public int Search(int key){
        if (head==null) {
            System.out.println("The list is empty");
            return -1;
        }
        Node temp=head;
        while (temp!=null) {
            if (temp.data==key) {
                return count;
            }
            count++;
            temp=temp.next;
        }
        return -1;
    }
    // Q2
    public void deleteNumbers(){
        while (head != null && head.data > 25) {
            head = head.next;
        }
        if (head == null) {
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while (currNode!=null) {
            if (currNode.data>25) {
                prevNode.next=currNode.next;
            }
            else{
                prevNode=currNode;
            }
            currNode=currNode.next;
        }
    }
    public static void main(String[] args) {
    //  Q1. 
       Prac1 list = new Prac1();
        // list.addLast(1);
        // list.addLast(5);
        // list.addLast(7);
        // list.addLast(3);
        // list.addLast(8);
        // list.addLast(2);
        // list.addLast(3);
        // list.printList();
        // int index =list.Search(7);
        // if (index==-1) {
        //     System.out.println("The element is not present in the list.");
        // }
        // else
        // System.out.println("The number is present at index: "+index);
    // Q2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the linked list (numbers in the range of 1-50):");
        System.out.println("(Enter -1 to stop)");
        int num;
        while ((num=sc.nextInt())!=-1) {
            if (num>=1 && num<=50 ) {
                list.addLast(num);
            }
            else
            System.out.println("The number should be in range 1<=n<=50");
        }
        list.printList();
        list.deleteNumbers();
        list.printList();
        
    }
    
}
