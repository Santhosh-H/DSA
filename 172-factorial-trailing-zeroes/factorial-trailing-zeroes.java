class Solution {
    public int trailingZeroes(int n) {
       int ans = 0;
        while (n >= 5) {
            n /= 5; // Count how many multiples of 5 are there
            ans += n; // Add them to the result
        }
        return ans;
    }
}