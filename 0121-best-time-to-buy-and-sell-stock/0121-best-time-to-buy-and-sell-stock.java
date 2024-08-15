public class Solution {
    public int maxProfit(int[] prices) {
        // Initialize the minPrice to a large value and maxProfit to 0
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        // Loop through each price in the array
        for (int price : prices) {
            // Update minPrice if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate potential profit if sold at the current price
            int profit = price - minPrice;
            
            // Update maxProfit if the current profit is higher
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        
        // Return the maximum profit found
        return maxProfit;
    }
}
