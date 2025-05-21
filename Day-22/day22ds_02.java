// Day 22: Data Structure and Algorithms: LeetCode 169. Majority Element
import java.util.*;

public class day22ds_02 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > nums.length / 2)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        day22ds_02 obj = new day22ds_02();
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(obj.majorityElement(nums));
    }
}
