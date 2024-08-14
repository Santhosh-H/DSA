class Solution {
    public int mySqrt(int x) {
        int left = 0;        // Initialize the left boundary of the search space
        int right = x;       // Initialize the right boundary of the search space

        while (left < right) { // Loop until the search space is narrowed down to one element
            int mid = (left + right + 1) >>> 1; // Compute the middle point, using unsigned right shift for safe division by 2

            if (mid <= x / mid) { // If the square of mid is less than or equal to x
                left = mid;        // Move the left boundary to mid, as mid is a potential solution
            } else {
                right = mid - 1;   // Otherwise, discard mid and the right search space
            }
        }
        // The loop exits when left == right, which will be the largest integer less than or equal to the sqrt(x)
        return left; // Return the calculated square root
    }
}