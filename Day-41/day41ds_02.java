// Day 41: Data Structure and Algorithms: LeetCode 14. Longest Common Prefix
import java.util.*;

public class day41ds_02 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        char first[] = strs[0].toCharArray();
        char last[] = strs[strs.length - 1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;
            sb.append(first[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        day41ds_02 obj = new day41ds_02();
        System.out.println(obj.longestCommonPrefix(strs));
    }
}
