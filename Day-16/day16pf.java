// Day 16: Programming Fundamentals: LeetCode 633. Sum of Square Numbers
public class day16pf {
    public boolean judgeSquareSum(int c) {
        if (c < 0)
            return false;

        long left = 0;
        long right = (int) Math.sqrt(c);

        while (left <= right) {
            long sum = ((left * left) + (right * right));
            if (sum == c)
                return true;
            else if (sum < c)
                left++;
            else
                right--;
        }
        return false;
    }

    public static void main(String[] args) {
        day16pf obj = new day16pf();
        int c = 73;
        System.out.println(obj.judgeSquareSum(c));
    }
}
