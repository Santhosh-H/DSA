class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1; // Base cases: 1 way to be at ground (n = 0), 1 way to reach 1st stair (n = 1)
        }
        
        int[] ways = new int[n + 1];
        ways[0] = 1;
        ways[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        
        return ways[n];
    }
}