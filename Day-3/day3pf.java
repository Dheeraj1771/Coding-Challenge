// Day 3: Programming Fundamentals: LeetCode 507. Perfect Number
public class day3pf {
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i=1; i<num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        if(sum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean ans = checkPerfectNumber(28);
        System.out.println(ans);
    }
}
