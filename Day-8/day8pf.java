// Day 8: Programming Fundamentals: LeetCode 171. Excel Sheet Column Number
public class day8pf {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for(int i=0; i<columnTitle.length(); i++) {
            res *= 26;
            res += (columnTitle.charAt(i) - 'A' + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        day8pf obj = new day8pf();
        System.out.println(obj.titleToNumber("A"));
        System.out.println(obj.titleToNumber("AB"));
        System.out.println(obj.titleToNumber("ZY"));
    }
}