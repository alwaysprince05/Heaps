import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // ye max element ko top pr print karne ke liye hota hai.
        pq.add(2);
        System.out.println(pq+" "+pq.peek()); // peek is used to print the max element of the heap
        pq.add(10);
        System.out.println(pq+" "+pq.peek()); 
        pq.add(1);
        System.out.println(pq+" "+pq.peek()); 
        pq.remove();
        System.out.println(pq+" "+pq.peek()); 
        pq.add(0);
        System.out.println(pq+" "+pq.peek()); 
        pq.add(-34);
        System.out.println(pq+" "+pq.peek());
    }
}
