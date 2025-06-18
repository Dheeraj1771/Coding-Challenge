// Day 50: Data Structure and Algorithms: LeetCode 1328. Break a Palindrome
public class day50ds_01 {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() <= 1)
            return "";
        char[] arr = palindrome.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        arr[arr.length - 1] = 'b';
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        day50ds_01 obj = new day50ds_01();
        String palindrome = "abccba";
        System.out.println(obj.breakPalindrome(palindrome));
    }
}