// Day 45: Data Structure and Algorithms: LeetCode 1071. Greatest Common Divisor of Strings
public class day45ds_02 {
    public String gcdOfStrings(String str1, String str2) {
        if (str2.length() > str1.length())
            return gcdOfStrings(str2, str1);
        if (str1.equals(str2))
            return str1;
        if (str1.startsWith(str2))
            return gcdOfStrings(str1.substring(str2.length()), str2);
        return "";
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        day45ds_02 obj = new day45ds_02();
        System.out.println(obj.gcdOfStrings(str1, str2));
    }
}
