// Day 20: Data Structure and Algorithms: LeetCode 1979. Find Greatest Common Divisor of Array
public class day20ds_02 {
    public int gcd(int a, int b) {
        // By Euclidean Algorithm
        while(a > 0 && b > 0) {
            if(a > b) a %= b;
            else b %= a;
        }
        if(a == 0) return b;
        else return a;
    }

    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        return gcd(min, max);
    }

    public static void main(String[] args) {
        day20ds_02 obj = new day20ds_02();
        int[] nums = {2,5,6,9,10};
        System.out.println(obj.findGCD(nums));
    }
}
