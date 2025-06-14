// Day 46: Data Structure and Algorithms: LeetCode 762. Prime Number of Set Bits in Binary Representation
public class day46ds_02 {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int bits = countBits(i);
            if (isPrime(bits)) {
                result++;
            }
        }
        return result;
    }

    public int countBits(int n) {
        int cnt = 0;
        while (n != 0) {
            n = n & (n - 1);
            cnt++;
        }
        return cnt;
    }

    public boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 6, right = 10;
        day46ds_02 obj = new day46ds_02();
        System.out.println(obj.countPrimeSetBits(left, right));
    }
}
