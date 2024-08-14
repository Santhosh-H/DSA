class Solution {
    public int removeDuplicates(int[] nums) {
    //     Set<Integer> s = new LinkedHashSet<Integer>();
    
    // // Add all elements to the set
    // for (int num : nums) {
    //     s.add(num);
    // }
    
    // // Place the unique elements back into the nums array
    // int index = 0;
    // for (int unique : s) {
    //     nums[index++] = unique;
    // }
    
    // // Return the number of unique elements
    // return s.size();

    if (nums.length == 0) return 0;
    
    int k = 1; // pointer to the next unique element position
    
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[k] = nums[i];
            k++;
        }
    }
    
    return k;
    }
}