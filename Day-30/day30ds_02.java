// Day 30: Data Structure and Algorithms: LeetCode 287. Find the Duplicate Number
public class day30ds_02 {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast)
                break;
        }
        int slow2 = nums[0];
        while (slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        return slow;
    }

    public static void main(String[] args) {
        day30ds_02 obj = new day30ds_02();
        int nums[] = { 1, 3, 4, 2, 2 };
        System.out.println(obj.findDuplicate(nums));
    }
}
