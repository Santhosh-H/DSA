class Solution {
    public int coinChange(int[] coins, int amount) {
      // Create a DP array and initialize it with a large value
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        // Iterate over each coin
        for (int coin : coins) {
            // Update the DP array for each amount that can be made using the coin
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        // Check if it's possible to make the amount
        return dp[amount] > amount ? -1 : dp[amount];
    }
}