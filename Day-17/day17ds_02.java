// Day 17: Data Structure and Algorithms: LeetCode 1. Two Sum
import java.util.*;

public class day17ds_02 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        day17ds_02 obj = new day17ds_02();
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        int[] ans = obj.twoSum(nums, target);
        System.out.print("[ ");
        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}
