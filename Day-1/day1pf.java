// Day 1: Programming Fundamentals: LeetCode 268. Missing Number
public class day1pf {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n*(n+1))/2;
        int arrSum = 0;
        for(int i=0; i<n; i++) {
            arrSum += nums[i];
        }
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        day1pf obj = new day1pf();
        int[] nums = {0,1,2,3,4,5,6,7,8,10};
        System.out.println(obj.missingNumber(nums));
    }
}
