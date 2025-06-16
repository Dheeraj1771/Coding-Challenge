// Day 48: Data Structure and Algorithms: LeetCode 461. Hamming Distance
public class day48ds_02 {
    public int hammingDistance(int x, int y) {
        if (x == y)
            return 0;
        int ans = 0;
        while (x > 0 || y > 0) {
            if (x % 2 != y % 2)
                ans++;
            x /= 2;
            y /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 1, y = 4;
        day48ds_02 obj = new day48ds_02();
        System.out.println(obj.hammingDistance(x, y));
    }
}
