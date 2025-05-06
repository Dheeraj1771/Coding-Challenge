// Day 7: Programming Fundamentals: LeetCode 66. Plus One
public class day7pf {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if(digits[i] + 1 != 10) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int newdigits[] = new int[n+1];
        newdigits[0] = 1;
        return newdigits;
    }

    public static void main(String[] args) {
        day7pf obj = new day7pf();
        int[] digits = {1, 2, 3};
        int[] result = obj.plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
