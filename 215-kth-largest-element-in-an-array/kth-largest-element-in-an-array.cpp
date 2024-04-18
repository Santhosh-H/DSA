class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        priority_queue<int> MinHeap;
        int s=nums.size();
        int ans;
        for(auto i=0;i<s;i++){
            MinHeap.push(-1*nums[i]);
            if(MinHeap.size()>k){
                MinHeap.pop();
            }
        }
        ans=-1*MinHeap.top();
        return ans;
    }
};