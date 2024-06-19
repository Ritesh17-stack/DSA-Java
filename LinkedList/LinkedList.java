package LinkedList;
import java.util.ArrayList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public ListNode() {
        this.val = -1;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;
    ListNode tail;
    int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public int get(int index) {
        if (head == null || index >= size || index < 0){
            return -1;
        }
        ListNode temp = head;
        while (index > 0&& temp.next!=null) {
            temp = temp.next;
            index--;
        }
        return temp.val;
    }
    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertTail(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public boolean remove(int index) {
        if (head == null || index >= size || index < 0) {
            return false;
        }
        if (index == 0) {
            head = head.next;
            if(head==null) {
                tail=null;
            }
            size--;
            return true;
        }
        ListNode curr = head.next;
        ListNode prev = head;
        int i = 1;
        while (i <index && curr != null) {
            prev = prev.next;
            curr = curr.next;
            i++;
        }
        if (curr != null) {
            prev.next = curr.next;
        }
        if (prev.next == null) {
            tail =prev;
        }
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        if (head == null && tail == null) {
            return list;
        }
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        return list;
    }
    public void printList(){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.insertHead(1);
//        list.insertHead(5);
//        list.insertTail(6);
//        list.remove(1);
//        list.printList();
        System.out.println(list.getValues());
//        System.out.println(list.get(0));
    }
}