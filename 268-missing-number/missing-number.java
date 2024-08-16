class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor_all = 0;
        
        // XOR all the indices and all the numbers in the array
        for (int i = 0; i <= n; i++) {
            xor_all ^= i;
        }
        
        for (int num : nums) {
            xor_all ^= num;
        }
        
        return xor_all;
    }
}