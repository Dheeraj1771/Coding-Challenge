// Day 14: Programming Fundamentals: LeetCode 7. Reverse Integer
public class day14pf {
    public int reverse(int x) {
        int rev = 0;
        int rem = 0;
        while(x != 0) {
            rem = x % 10;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) {
                return 0;
            } else {
                rev = (rev * 10) + rem;
                x = x/10;
            }
        }
        return rev;
    }

    public static void main(String[] args) {
        day14pf obj = new day14pf();
        int x = 123;
        int result = obj.reverse(x);
        System.out.println(result);
    }
}
