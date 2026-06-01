class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int ele : prices) {
            buy = Math.min(buy, ele);
            profit = Math.max(profit, ele - buy);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}