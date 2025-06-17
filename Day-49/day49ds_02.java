// Day 49: Data Structure and Algorithms: LeetCode 136. Single Number
import java.util.*;

public class day49ds_02 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) == 1)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        day49ds_02 obj = new day49ds_02();
        int[] nums = { 2, 2, 1 };
        System.out.println(obj.singleNumber(nums));
    }
}
