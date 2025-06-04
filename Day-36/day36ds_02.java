// Day 36: Data Structure and Algorithms: LeetCode 345. Reverse Vowels of a String
public class day36ds_02 {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] sc = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while (i < j) {
            while (i < j && vowels.indexOf(sc[i]) == -1) {
                i++;
            }
            while (i < j && vowels.indexOf(sc[j]) == -1) {
                j--;
            }
            char temp = sc[i];
            sc[i] = sc[j];
            sc[j] = temp;

            i++;
            j--;
        }
        String ans = new String(sc);
        return ans;
    }

    public static void main(String[] args) {
        day36ds_02 obj = new day36ds_02();
        String s = "IceCreAm";
        System.out.println(obj.reverseVowels(s));
    }
}
