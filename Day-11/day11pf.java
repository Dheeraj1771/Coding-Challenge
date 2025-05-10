// Day 11: Programming Fundamentals: LeetCode 172. Factorial Trailing Zeroes
public class day11pf {
    public int trailingZeroes(int n) {
        int tz = 0;
        while (n > 0) {
            n /= 5;
            tz += n;
        }
        return tz;
    }

    public static void main(String[] args) {
        day11pf obj = new day11pf();
        System.out.println(obj.trailingZeroes(25));
    }
}
