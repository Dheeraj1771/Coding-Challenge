// Day 33: Data Structure and Algorithms: LeetCode 2697. Lexicographically Smallest Palindrome
public class day33ds_02 {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            sb.append(Character.toString(Math.min(s.charAt(i), s.charAt(n - i - 1))));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        day33ds_02 obj = new day33ds_02();
        String s = "abca";
        System.out.println(obj.makeSmallestPalindrome(s));
    }
}
