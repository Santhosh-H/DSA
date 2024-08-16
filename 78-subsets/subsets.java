class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int totalSubsets = 1 << n;  // 2^n subsets

        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> currentSubset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                // Check if the j-th bit of i is set (i.e., include nums[j] in the subset)
                if ((i & (1 << j)) != 0) {
                    currentSubset.add(nums[j]);
                }
            }
            result.add(currentSubset);
        }

        return result;
    }
}