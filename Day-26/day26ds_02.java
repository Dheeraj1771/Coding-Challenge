// Day 26: Data Structure and Algorithms: LeetCode 34. Find First and Last Position of Element in Sorted Array
import java.util.*;

public class day26ds_02 {
    public int[] searchRange(int[] nums, int target) {
        int left = LeftBound(nums, target);
        int right = RightBound(nums, target);
        return new int[] { left, right };
    }

    public int LeftBound(int nums[], int target) {
        int ind = -1, low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                ind = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ind;
    }

    public int RightBound(int nums[], int target) {
        int ind = -1, low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                ind = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        day26ds_02 obj = new day26ds_02();
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] result = obj.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
