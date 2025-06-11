// Day 43: Data Structure and Algorithms: LeetCode 6. Zigzag Conversion
public class day43ds_02 {
    public String convert(String s, int numRows) {
        String[] str = new String[numRows];
        for (int i = 0; i < str.length; i++) {
            str[i] = "";
        }
        int i = 0;
        while (i < s.length()) {
            for (int ind = 0; ind < numRows && i < s.length(); ind++) {
                str[ind] += s.charAt(i++);
            }
            for (int ind = numRows - 2; ind > 0 && i < s.length(); ind--) {
                str[ind] += s.charAt(i++);
            }
        }
        String res = "";
        for (String ind : str) {
            res += ind;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        day43ds_02 obj = new day43ds_02();
        System.out.println(obj.convert(s, numRows));
    }
}
