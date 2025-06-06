// Day 38: Data Structure and Algorithms: LeetCode 125. Valid Palindrome
public class day38ds_02 {
    public boolean isPalindrome(String s) {
        String cleanStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder n = new StringBuilder();
        for (int i = cleanStr.length() - 1; i >= 0; i--) {
            n.append(cleanStr.charAt(i));
        }
        if (cleanStr.equals(n.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        day38ds_02 obj = new day38ds_02();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(obj.isPalindrome(s));
    }
}
