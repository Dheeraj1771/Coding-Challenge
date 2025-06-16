// Day 48: Data Structure and Algorithms: LeetCode 1250. Check If It Is a Good Array
public class day48ds_01 {
    public boolean isGoodArray(int[] nums) {
        int x = nums[0], y;
        for (int a : nums) {
            while (a > 0) {
                y = x % a;
                x = a;
                a = y;
            }
        }
        return x == 1;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 5, 7, 23 };
        day48ds_01 obj = new day48ds_01();
        System.out.println(obj.isGoodArray(nums));
    }
}