class Solution {
    public double myPow(double x, int n) {
      if (n == 0) return 1;
        if (x == 0) return 0;
        
        // Handling the edge case where n is the smallest integer (-2147483648)
        // This case is special because we can't negate Integer.MIN_VALUE directly
        if (n == Integer.MIN_VALUE) {
            // Handle by using the property: x^(-2147483648) = (x^(-2147483647) / x)
            // We will first calculate x^(-2147483647) and then divide by x
            return myPow(x, Integer.MIN_VALUE + 1) / x;
        }
        
        // Store the absolute value of n
        int m = n;
        
        // If n is negative, make m positive and adjust the result later
        if (n < 0) {
            m = -n;
        }

        double ans = 1;
        while (m > 0) {
            if (m % 2 == 1) {
                ans = ans * x;  // If m is odd, multiply ans by x
                m = m - 1;  // Reduce m by 1
            } else {
                x = x * x;  // Square the base
                m = m / 2;  // Divide m by 2
            }
        }
        
        // If n was negative, invert the result
        if (n < 0) ans = 1.0 / ans;

        return ans;
    }
}