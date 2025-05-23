// Day 24: Data Structure and Algorithms: LeetCode 283. Move Zeroes
public class day24ds_02 {
    public void moveZeroes(int[] nums) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        while (pointer < nums.length) {
            nums[pointer] = 0;
            pointer++;
        }
    }

    public static void main(String[] args) {
        day24ds_02 obj = new day24ds_02();
        int[] nums = { 0, 1, 0, 3, 12 };
        obj.moveZeroes(nums);
        System.out.print("[ ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
    }
}
