import java.util.PriorityQueue;

public class BasicHeapCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Minheap implimentation
        pq.add(2);
        System.out.println(pq+" "+pq.peek()); // used to print the min element of the heap
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
