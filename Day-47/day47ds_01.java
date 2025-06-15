// Day 47: Data Structure and Algorithms: LeetCode 1358. Number of Substrings Containing All Three Characters
public class day47ds_01 {
    public int numberOfSubstrings(String s) {
        int left = 0, right = 0, cnt = 0;
        int[] chararr = new int[3];
        while (right < s.length()) {
            chararr[s.charAt(right) - 'a']++;
            while (chararr[0] > 0 && chararr[1] > 0 && chararr[2] > 0) {
                cnt += s.length() - right;
                chararr[s.charAt(left++) - 'a']--;
            }
            right++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        day47ds_01 obj = new day47ds_01();
        System.out.println(obj.numberOfSubstrings(s));
    }
}
