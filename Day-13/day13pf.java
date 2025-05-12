// Day 13: Programming Fundamentals: LeetCode 1822. Sign of the Product of an Array
public class day13pf {
    public int arraySign(int[] nums) {
        int negativeCount = 0;
        for (int i : nums) {
            if (i == 0)
                return 0;
            if (i < 0)
                negativeCount++;
        }
        if (negativeCount % 2 == 0)
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        day13pf obj = new day13pf();
        int[] nums = { -1, -2, -3, -4, 3, 2, 1 };
        System.out.println(obj.arraySign(nums));
    }
}
