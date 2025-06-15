// Day 47: Data Structure and Algorithms: LeetCode 191. Number of 1 Bits
public class day47ds_02 {
    public int hammingWeight(int n) {
        int cnt = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1)
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int n = 11;
        day47ds_02 obj = new day47ds_02();
        System.out.println(obj.hammingWeight(n));
    }
}