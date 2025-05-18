// Day 19: Data Structure and Algorithms: LeetCode 20. Valid Parentheses
import java.util.*;

public class day19ds_01 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    char top = st.peek();
                    if (s.charAt(i) == ')' && top == '(' || s.charAt(i) == ']' && top == '['
                            || s.charAt(i) == '}' && top == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        day19ds_01 obj = new day19ds_01();
        String s = "(([{}]))";
        System.out.println(obj.isValid(s));
    }
}