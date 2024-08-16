class Solution {
    public int findPeakElement(int[] nums) {
    int low = 0;
        int high = nums.length - 1;

        // Handle the case where there's only one element
        if (nums.length == 1) return 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || nums[mid] > nums[mid - 1]) &&
                (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            }
            // If the mid element is less than the next element, move to the right half
            else if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            }
            // Otherwise, move to the left half
            else {
                high = mid - 1;
            }
        }

        return -1;  // This line will never be reached
    }
}