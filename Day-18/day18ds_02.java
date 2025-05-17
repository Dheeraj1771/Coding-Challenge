// Day 18: Data Structure and Algorithms: LeetCode 217. Contains Duplicate
import java.util.*;

public class day18ds_02 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        day18ds_02 obj = new day18ds_02();
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(obj.containsDuplicate(nums));
    }
}
