package org.example;

public class A714买卖股票的最佳时机含手续费 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if (n < 2){
            return 0;
        }
        int ans = 0;
        int minimun = prices[0];
        for (int i = 0; i < n; i++) {
            if (prices[i] < minimun){
                minimun = prices[i];
            }
            else if (prices[i] > minimun+fee){
                ans += prices[i] - minimun - fee;
                minimun = prices[i] - fee;
            }
        }
        return  ans;
    }
}
