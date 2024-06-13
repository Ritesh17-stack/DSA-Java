package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;


public class CollectionFrameworks {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList <>();
        queue.add(4);
        queue.add(45);
        queue.add(46);
        queue.add(3);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);
        Deque<Integer> deque= new ArrayDeque<Integer>();
        deque.addFirst(5);
        deque.add(6);
        deque.addLast(10);
        deque.remove();
        System.out.println(deque);
    
    }
}
