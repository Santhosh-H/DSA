public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;

        // Iterate through all 32 bits
        for (int i = 0; i < 32; i++) {
            // Shift the result left by 1 to make space for the next bit
            result <<= 1;

            // Add the least significant bit of n to the result
            result |= (n & 1);

            // Shift n right by 1 to process the next bit
            n >>= 1;
        }

        return result;
    }
}