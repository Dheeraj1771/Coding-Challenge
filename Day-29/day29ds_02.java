// Day 29: Data Structure and Algorithms: LeetCode 215. Kth Largest Element in an Array
import java.util.*;

public class day29ds_02 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (pq.peek() < nums[i]) {
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        day29ds_02 d = new day29ds_02();
        System.out.println(d.findKthLargest(new int[] { 3, 2, 1, 5, 6, 4 }, 2));
    }
}
