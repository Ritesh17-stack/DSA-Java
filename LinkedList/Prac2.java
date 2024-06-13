package LinkedList;
// Q Check if the list is palindrome or not
public class Prac2{

    class ListNode{
    int data;
    ListNode next;
    ListNode(){}
    ListNode(int data){this.data=data;}
    ListNode(int data,ListNode next){this.data=data;this.next=next;}
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr!=null) {
            ListNode nextNode = curr.next;
            curr.next=prev;
            prev = curr;
            curr=nextNode;
        }   
        return prev;
    }
    public ListNode findmiddle(ListNode head){
        ListNode hare= head;
        ListNode turtle= head;
        while (hare!=null && hare.next!=null) {
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head){
        if (head==null||head.next==null) {
            return true;
        }
        ListNode middle = findmiddle(head);
        ListNode secondHalfStart = reverse(middle.next);
        ListNode firstHalfStart=head;
        while(secondHalfStart!=null){
        if (firstHalfStart.data!=secondHalfStart.data) {
            return false;    
        }         
        firstHalfStart=firstHalfStart.next;
        secondHalfStart=secondHalfStart.next;
        }
        return true;
    }
    public static void main(String[] args){
        Prac2 list = new Prac2();
         ListNode head = list.new ListNode(1);
         head.next = list.new ListNode(2);
         head.next.next = list.new ListNode(2);
         head.next.next.next = list.new ListNode(1);
         System.out.println(list.isPalindrome(head));
    }
}

