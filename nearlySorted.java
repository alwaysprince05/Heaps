import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class nearlySorted {
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> ans = new ArrayList<>();
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k) ans.add(pq.remove());
        }
        while (pq.size()>0) {
            ans.add(pq.remove());
        }
        System.out.println(ans);
    }

    // solution of the kth cloest element -> using HashMap
//     class Solution {
//     public class Pair{
//         int x;
//         int y;
//         Pair(int x, int y){
//             this.x = x;
//             this.y = y;
//         }
//     }
//     public int[][] kClosest(int[][] points, int k) {
//         // MaxHeap
//    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         HashMap<Integer,Pair> map = new HashMap<>();
//         for(int i=0;i<points.length;i++){
//             int x = points[i][0], y = points[i][1];
//             int d2 = x*x + y*y;
//             pq.add(d2);
//             map.put(d2,new Pair(x,y));
//             if(pq.size()>k) pq.remove();
//         } 
//         int [][] ans = new int[k][2];
//         for(int i=0;i<k;i++){
//             int dist = pq.remove();
//             Pair pt = map.get(dist);
//             ans[i][0] = pt.x;
//             ans[i][1] = pt.y;
//         }
//         return ans;
//     }
// } // but this is not the good way because hashmap me same key ke 2 element map nhi ho sakte hai.

// Solving using the triplet -> Custom Comparator Method

// public class Triplet {
//     int d;
//     int x;
//     int y;
//     Triplet(int d, int x, int y){
//         this.d = d;
//         this.x = x;
//         this.y = y;
//     }
// }
// public int[][] kClosest(int[][] points, int k){
//     // MaxHeap
//     PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
//     for(int i=0;i<points.length;i++){
//         int x = points[i][0], y = points[i][1];
//         int d = x*x + y*y;
//         pq.add(new Triplet(d,x,y));
//         if(pq.size()>k) pq.remove();
//     }
//     int[][] ans = new int[k][2];
//     for(int i=0;i<k;i++){
//         Triplet t = pq.remove();
//         ans[i][0] = t.x;
//         ans[i][1] = t.y;
//     }
//     return ans;
// }

// use of custom comparatable methos
public class Triplet implements Comparable<Triplet>{
    int d;
    int x;
    int y;
    Triplet(int d, int x, int y){
        this.d = d;
        this.x = x;
        this.y = y;
    }
    public int compareTO(Triplet t){
        return this.d - t.d; // means d ke basis pe sorting perform hogi.
    }
}
public int[][] kClosest(int[][] points, int k){
    // MaxHeap
    PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<points.length;i++){
        int x = points[i][0], y = points[i][1];
        int d = x*x + y*y;
        pq.add(new Triplet(d,x,y));
        if(pq.size()>k) pq.remove();
    }
    int[][] ans = new int[k][2];
    for(int i=0;i<k;i++){
        Triplet t = pq.remove();
        ans[i][0] = t.x;
        ans[i][1] = t.y;
    }
    return ans;
}
}
