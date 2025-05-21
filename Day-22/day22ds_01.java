// Day 22: Data Structure and Algorithms: LeetCode 1249. Minimum Remove to Make Valid Parentheses
import java.util.*;

public class day22ds_01 {
    public String minRemoveToMakeValid(String s) {
        int cnt = 0;
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
                list.add(s.charAt(i));
            } else if (s.charAt(i) == ')' && cnt > 0) {
                cnt--;
                list.add(s.charAt(i));
            } else if (s.charAt(i) != ')') {
                list.add(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            if (cnt > 0 && list.get(i) == '(') {
                cnt--;
            } else {
                sb.append(list.get(i));
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        day22ds_01 obj = new day22ds_01();
        System.out.println(obj.minRemoveToMakeValid("a)b(c)d"));
    }
}
