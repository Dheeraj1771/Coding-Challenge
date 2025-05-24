// Day 25: Data Structure and Algorithms: LeetCode 189. Rotate Array
import java.util.*;
public class day25ds_02 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);
    }

    public void reverseArray(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        day25ds_02 obj = new day25ds_02();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        obj.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
