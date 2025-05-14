// Day 15: Programming Fundamentals: LeetCode 168. Excel Sheet Column Title
public class day15pf {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0) {
            int r = (columnNumber - 1) % 26;
            sb.append((char)(r + 'A'));
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int columnNumber = 28;
        day15pf obj = new day15pf();
        String ans = obj.convertToTitle(columnNumber);
        System.out.println(ans);
    }
}
