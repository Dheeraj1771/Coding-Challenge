// Day 19: Data Structure and Algorithms: LeetCode 21. Best Time to Buy and Sell Stock
public class day19ds_02 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - min;
            maxProfit = Math.max(maxProfit, profit);
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        day19ds_02 obj = new day19ds_02();
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(obj.maxProfit(prices));
    }
}
