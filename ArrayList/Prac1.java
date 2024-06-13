package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Prac1 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // Add element at last(append)
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.add(4); 
        System.out.println(list);
        // Get element at an index
        int element = list.get(2);
        System.out.println(element);
        // Add element in between the list
        list.add(2,5);
        System.out.println(list);
        // Set value at an index
        list.set(2,6);
        System.out.println(list);
        // Size of ArrayList
        int size = list.size();
        System.out.println(size);
        // Iteration
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
    }
    // Sorting Arraylist requires importing of Collection class
}
