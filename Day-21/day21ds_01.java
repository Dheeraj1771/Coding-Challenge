// Day 21: Data Structure and Algorithms: LeetCode 119. Pascal's Triangle II
import java.util.*;

public class day21ds_01 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        int newrowIndex = rowIndex + 1;
        long ans = 1;
        res.add((int) ans);
        for (int i = 1; i < newrowIndex; i++) {
            ans *= (newrowIndex - i);
            ans /= i;
            res.add((int) ans);
        }
        return res;
    }

    public static void main(String[] args) {
        day21ds_01 obj = new day21ds_01();
        int rowIndex = 3;
        List<Integer> pt = obj.getRow(rowIndex);
        System.out.println(pt);
    }
}