// Day 44: Data Structure and Algorithms: LeetCode 1456. Maximum Number of Vowels in a Substring of Given Length
public class day44ds_02 {
    public int isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return 1;
        return 0;
    }

    public int maxVowels(String s, int k) {
        int currVowel = 0, maxVowel = 0;
        for (int i = 0; i < s.length(); i++) {
            currVowel += isVowel(s.charAt(i));

            if (i >= k) {
                currVowel -= isVowel(s.charAt(i - k));
            }
            if (currVowel > maxVowel)
                maxVowel = currVowel;
        }
        return maxVowel;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        day44ds_02 obj = new day44ds_02();
        System.out.println(obj.maxVowels(s, k));
    }
}
