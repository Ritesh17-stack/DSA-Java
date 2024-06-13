package LinkedList;
import java.util.*;

public class NthNodeFromLast{
    Node head;
    class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }  
    }
    public void addLast(int data){
        Node newNode = new Node(data);
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
    public void removeNthNode(int n){
        if (head.next==null) {
            return;
        }
        int size = 0;
        Node currNode = head;
        while (currNode!=null) {
            size++;
            currNode=currNode.next;
        }
       int indextoSearch = size-n;
       Node prevNode = head;
       int i =1;
       while (i<indextoSearch) {
        prevNode=prevNode.next;
        i++;
       }
       prevNode.next=prevNode.next.next;
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
    public static void main(String[] args) {
        NthNodeFromLast list = new NthNodeFromLast();
        list.removeNthNode(3);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();   
        list.removeNthNode(3);
        list.printList();
    }
}    


