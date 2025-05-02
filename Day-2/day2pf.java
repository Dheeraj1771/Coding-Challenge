// Day 2: Programming Fundamentals: LeetCode 258. Add Digits
public class day2pf {
    public int addDigits(int num) {
        while(num >= 10) {
            int sum = 0;
            while(num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        day2pf obj = new day2pf();
        System.out.println(obj.addDigits(38));
    }
}
