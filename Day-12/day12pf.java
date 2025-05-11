// Day 12: Programming Fundamentals: LeetCode 1523. Count Odd Numbers in an Interval Range
public class day12pf {
    public int countOdds(int low, int high) {
        int len = high - low + 1;
        int count = len / 2;
        if(len % 2 != 0 && low % 2 != 0) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        day12pf sol = new day12pf();
        System.out.println(sol.countOdds(3, 7));
    }
}
