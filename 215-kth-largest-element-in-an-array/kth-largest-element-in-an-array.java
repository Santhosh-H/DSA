class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //Scanner sc=new Scanner(System.in);
        for(int i=0;i<nums.length;i++){
            pq.add(-1*nums[i]);
        }
        int ans=0;
        for(int i=0;i<k;i++){
            ans=pq.remove();
            
        }
        return -1*ans;
    }
}