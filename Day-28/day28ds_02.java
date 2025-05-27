// Day 28: Data Structure and Algorithms: LeetCode 2470. Number of Subarrays With LCM Equal to K
public class day28ds_02 {
    public int cal_gcd(int a, int b) {
        while(a>0 && b>0) {
            if(a > b) a %= b;
            else b %= a;
        }
        if(a == 0) return b;
        return a;
    }

    public int subarrayLCM(int[] nums, int k) {
        int cnt = 0;
        int size = nums.length;
        for(int i=0; i<size; i++) {
            int lcm = nums[i];
            if(lcm == k) cnt++;
            for(int j=i+1; j<size; j++) {
                int gcd = cal_gcd(lcm , nums[j]);
                lcm = (lcm * nums[j]) / gcd;

                if(lcm > k) break;
                if(lcm == k) cnt++;
            }
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        day28ds_02 obj = new day28ds_02();
        int[] nums = {3, 6, 2, 7, 1};
        int k = 6;
        System.out.println(obj.subarrayLCM(nums, k));
    }
}
