public class day27ds_02 {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0; i<nums.length; i++) {
            currsum = currsum + nums[i];
            if(currsum > maxsum) {
                maxsum = currsum;
            }
            if(currsum < 0) {
                currsum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        day27ds_02 obj = new day27ds_02();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(obj.maxSubArray(nums));
    }
}
