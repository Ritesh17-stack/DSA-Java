package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next=null;
    }
    Node(int val, Node next){
        this.val=val;
        this.next=next;
    }
    public Node(){
        this.val=-1;
        this.next=null;
    }

}
class Prac4{
    Node head;
    Node tail;
    int size;
    
    public Prac4(){
        head = null;
        tail = null;
        size = 0;
    }
    public int get(int index){
        if(head==null || index>=size || index<0){
            return -1;
        }
        Node temp = head;
        while (index>0 && temp.next!=null) {
            temp=temp.next;
            index--;
        }
        return temp.val;
    }
    public void insertHead(int val){
        Node newNode = new Node(val);
        if (head==null && tail==null) {
            head=newNode;
            tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void insertTail(int val){
        Node newNode = new Node(val);
        if (head==null && tail==null) {
            head=newNode;
            tail=newNode;
            size++;
            return;
        }
        tail.next= newNode;
        tail=newNode;
        size++;
    }
    public boolean remove(int index){
        if(head==null || index>=size|| index<0){
            return false;
        }
        if(index==0){
            head=head.next;
            if(head==null){
                tail=null;
            }
            size--;
            return true;
        }
        Node curr = head.next;
        Node prev = head;
        while (index>1 && curr!=null) {
            curr=curr.next;
            prev=prev.next;
            index--;
        }
        if(curr.next!=null){
            prev.next=curr.next;
        }
        if(prev.next==null){
            tail=prev;
        }
        size--;
        return true;
    }
    public void printList(){
        if(head==null){
            return;
        }
        Node temp = head;
        while(temp!=null){
            if(temp!=tail){
                System.out.print(temp.val+ "->");
            }
            else{
                System.out.println(temp.val);
            }
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
        Prac4 list = new Prac4();
        list.insertHead(1);
        list.insertTail(2);
        list.insertTail(3);
        list.insertTail(4);
        list.insertTail(5);
        list.printList();
        list.insertHead(0);
        list.printList();
        list.remove(0);
        list.printList();
        System.out.println(list.get(3));
    }
}
