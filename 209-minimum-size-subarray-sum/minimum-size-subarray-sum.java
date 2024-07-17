class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen=Integer.MAX_VALUE;
        int currsum=0;
        // two points and variable sliding window problem
        int low=0;
        int high=0;
        while(high<nums.length){
            currsum=currsum+nums[high];
            high++;
            while(currsum>=target){
                int windowsize=high-low;
                //updating minlen;
                minlen=Math.min(minlen,windowsize);
                //removing from back and checking again
                currsum=currsum-nums[low];
                low++;
            }
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}