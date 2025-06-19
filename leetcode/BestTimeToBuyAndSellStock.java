public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int maxprofit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxprofit = Math.max(maxprofit, prices[i] - minPrice);
            }
        }
        return maxprofit;
    }
    public static void main (String[] args){
        BestTimeToBuyAndSellStock best= new BestTimeToBuyAndSellStock();
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max Profit: " + best.maxProfit(prices));
    }
}
