package LinkedList;

class Prac6 {

  Prac6() {
    head = null;
    tail = null;
  }

  Node head;
  Node tail;

  private class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }

    Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
      return;
    }
    tail.next = newNode;
    newNode.next = head;
    tail = newNode;
  }

  public void delete(int data) {
    Node temp = head;
    if (temp == null) {
      System.out.println("The list is empty");
      return;
    }
    if (temp.data == data) {
      if (temp.next == head) { // only one node in the list
        head = null;
        tail = null;
      } else {
        tail.next = head.next;
        head = head.next;
      }
      return;
    }
    do {
      Node n = temp.next;
      if (n.data == data) {
        if (n == tail) { // last node
          temp.next = head;
          tail = temp;
        } else {
          temp.next = n.next;
        }
        break;
      }
      temp = temp.next;
    } while (temp != head);
  }

  public void display() {
    if (head == null) {
        System.out.println("The list is empty");
        return;
    }
    Node temp = head;
    do{
        System.out.print(temp.data+"->");
        temp=temp.next;
    }while(temp!=head);
    System.out.println("NULL");
  }
  public static void main(String[] args) {
    Prac6 list = new Prac6();
    list.insert(0);
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.delete(0);
    list.delete(2);
    list.display();
  }
}
