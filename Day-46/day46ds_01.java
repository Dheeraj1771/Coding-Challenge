// Day 46: Data Structure and Algorithms: LeetCode 1791. Find Center of Star Graph
public class day46ds_01 {
    public int findCenter(int[][] edges) {
        int[] e1 = edges[0];
        int[] e2 = edges[1];

        if (e1[0] == e2[0] || e1[0] == e2[1])
            return e1[0];
        return e1[1];
    }

    public static void main(String[] args) {
        int[][] edges = { { 1, 2 }, { 2, 3 }, { 4, 2 } };
        day46ds_01 obj = new day46ds_01();
        System.out.println(obj.findCenter(edges));
    }
}