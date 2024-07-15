class Solution {
    public int maxProfit(int[] prices) {
        int curr=Integer.MAX_VALUE;
        int maxi=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<curr)
            curr=prices[i];
            if(prices[i]-curr>maxi)
            maxi=prices[i]-curr;
        }
        return maxi;
    }
}