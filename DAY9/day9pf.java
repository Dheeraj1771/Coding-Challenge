// Day 9: Programming Fundamentals: LeetCode 400. Nth Digit
public class day9pf {
    public int findNthDigit(int n) {
        if (n <= 9) {
            return n;
        }

        long base = 9;
        int digit = 1;

        while (n > base * digit) {
            n -= base * digit;
            base *= 10;
            digit++;
        }

        long num = (long)Math.pow(10, digit - 1) + (n - 1) / digit;
        int ind = (n - 1) % digit;

        String numStr = Long.toString(num);
        return Character.getNumericValue(numStr.charAt(ind));
    }
    public static void main(String[] args) {
        day9pf obj = new day9pf();
        int n = 11;
        int result = obj.findNthDigit(n);
        System.out.println(result);
    }
}