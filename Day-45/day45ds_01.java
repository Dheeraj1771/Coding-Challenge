// Day 45: Data Structure and Algorithms: LeetCode 997. Find the Town Judge
public class day45ds_01 {
    public int findJudge(int n, int[][] trust) {
        int[] data = new int[n + 1];
        for (int[] arr : trust) {
            data[arr[0]]--;
            data[arr[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            int x = data[i];
            if (x == n - 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 2;
        int[][] trust = { { 1, 2 } };
        day45ds_01 obj = new day45ds_01();
        System.out.println(obj.findJudge(n, trust));
    }
}