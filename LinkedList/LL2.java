package LinkedList;
// LinkedList using Collection Frameworks
import java.util.*;
public class LL2 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.addFirst("a ");
        list1.addFirst("is ");
        list1.addLast("List");
        list1.addFirst("This ");
        list1.add(".");
        System.out.println(list1.size());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        list1.removeFirst();
        System.out.println(list1);
        list1.removeLast();
        System.out.println(list1);
        // Or
        list1.removeLast();
        System.out.println(list1);
    }
}
