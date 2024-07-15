class Solution {
    public int jump(int[] nums) {
          int n = nums.length;
      int jumps = 0;
      int currEnd = 0; // Current end of the reachable area
      int currstart = 0; // Farthest reachable position from the current position
      
      for (int i = 0; i < n - 1; i++) {
          // Update currstart
          if (i + nums[i] > currstart) {
              currstart = i + nums[i];
          }
          
          // If current position reaches currEnd, update currEnd and increment jumps
          if (i == currEnd) {
              jumps++;
              currEnd = currstart;

              
              // If the current end is beyond the last index, return the number of jumps
              if (currEnd >= n - 1) {
                  return jumps;
              }
          }
        // condition used in GFG minimum jump game same question
        //   // If we encounter a 0 in the array and cannot move further, return -1
        //   if (nums[i] == 0 && i == currEnd) {
        //       return -1;
        //   }
      }
      
      return jumps;
    }
}