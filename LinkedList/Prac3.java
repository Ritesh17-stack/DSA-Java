    package LinkedList;

    class Prac3{
        class ListNode{
            int data;
            ListNode next;
            ListNode(){}
            ListNode(int data){this.data=data;}
            ListNode(int data,ListNode next){this.data=data;this.next=next;}
        }
        public boolean isCycle(ListNode head){
            if (head==null) {
                return false;
            }
            ListNode fast=head;
            ListNode slow =head;
            while (fast!=null && fast.next!=null) {
                slow=slow.next;
                fast=fast.next.next;
                if (fast==slow) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            Prac3 list = new Prac3();
            ListNode head = list.new ListNode(1);
            head.next=list.new ListNode(2);
            head.next.next=list.new ListNode(3);
            head.next.next.next=list.new ListNode(4,head.next);
            System.out.println(list.isCycle(head));
        }
    } 