class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        // Compare the product of the three largest numbers and two smallest with the largest
        int option1 = nums[n-1] * nums[n-2] * nums[n-3];  // Product of three largest numbers
        int option2 = nums[0] * nums[1] * nums[n-1];      // Product of two smallest and largest number

        // Return the maximum of the two options
        return Math.max(option1, option2);
    }
}