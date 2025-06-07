// Day 39: Data Structure and Algorithms: LeetCode 1047. Remove All Adjacent Duplicates In String
public class day39ds_02 {
    public String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char curr = s.charAt(j);

            if (i > 0 && stack[i - 1] == curr)
                i--;
            else {
                stack[i] = curr;
                i++;
            }
        }
        return new String(stack, 0, i);
    }

    public static void main(String[] args) {
        String s = "abbaca";
        day39ds_02 obj = new day39ds_02();
        System.out.println(obj.removeDuplicates(s));
    }
}
