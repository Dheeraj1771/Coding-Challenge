// Day 49: Data Structure and Algorithms: LeetCode 1250. Check If It Is a Good Array
import java.util.*;

public class day49ds_01 {
    public int countPrimes(int n) {
        int cnt = 0;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        for (int i = 2; i * i <= n; i++) {
            if (prime[i] == true) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (prime[i] == true)
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        day49ds_01 obj = new day49ds_01();
        int n = 10;
        System.out.println(obj.countPrimes(n));
    }
}