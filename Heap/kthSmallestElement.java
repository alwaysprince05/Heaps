import java.util.PriorityQueue;

public class kthSmallestElement {
    public static void main(String[] args) {
        int [] arr = {10,2,8,3,-6,-2,9,-12};
        int k = 4;
        // MinHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
        }// n(log(n))
        for(int i=1;i<=k-1;i++){
            pq.remove();
        }// k(log(n))
        System.out.println(pq.peek());
    }
}
// but this process is the vaste of time n(log(n)) & k(log(n)) so this is useless.