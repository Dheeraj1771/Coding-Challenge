// Day 23: Data Structure and Algorithms: LeetCode 32. Longest Valid Parentheses
import java.util.*;

public class day23ds_01 {
    public int longestValidParentheses(String s) {
        if (s.length() == 0 || s.length() < 2)
            return 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                if (!st.isEmpty() && s.charAt(st.peek()) == '(')
                    st.pop();
                else
                    st.push(i);
            }
        }
        int max = Integer.MIN_VALUE;
        int curr = s.length();
        while (!st.isEmpty()) {
            int ele = st.pop();
            max = Math.max(max, curr - ele - 1);
            curr = ele;
        }
        return Math.max(max, curr);
    }

    public static void main(String[] args) {
        day23ds_01 obj = new day23ds_01();
        String s = "(()";
        System.out.println(obj.longestValidParentheses(s));
    }
}