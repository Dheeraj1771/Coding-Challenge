// Day 21: Data Structure and Algorithms: LeetCode 678. Valid Parenthesis String
public class day21ds_02 {
    public boolean checkValidString(String s) {
        int min = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                min++;
                max++;
            } else if (s.charAt(i) == ')') {
                min--;
                max--;
            } else {
                min--;
                max++;
            }
            if (min < 0)
                min = 0;
            if (max < 0)
                return false;
        }
        return min == 0;
    }

    public static void main(String[] args) {
        day21ds_02 obj = new day21ds_02();
        String s = "(*))";
        System.out.println(obj.checkValidString(s));
    }
}
