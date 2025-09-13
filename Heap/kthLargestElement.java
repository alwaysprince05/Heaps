import java.util.PriorityQueue;

public class kthLargestElement {

    public static void main(String[] args) {
        int[] arr = {10, 2, 8, 3, -6, -2, 9, -12};
        int k = 2;
        int result = findkthlargest(arr, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }

    static int findkthlargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
            if (pq.size() > k) pq.remove();
        }
        return pq.peek();
    }
}