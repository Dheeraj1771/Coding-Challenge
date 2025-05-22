// Day 23: Data Structure and Algorithms: LeetCode 35. Search Insert Position
public class day23ds_02 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        day23ds_02 obj = new day23ds_02();
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(obj.searchInsert(nums, target));
    }
}
