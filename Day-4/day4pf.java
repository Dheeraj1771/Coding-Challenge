// Day 4: Programming Fundamentals: LeetCode 9. Palindrome Number
public class day4pf {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rem = 0;
        int rev = 0;
        if (x == 0) {
            return true;
        }
        if (x < 0) {
            return false;
        }
        else {
            while(x > 0) {
                rem = x % 10;
                rev = (rev * 10) + rem;
                x = x/10; 
            }
            if (temp == rev) {
                return true;
            } else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        day4pf obj = new day4pf();
        System.out.println(obj.isPalindrome(123));
    }
}