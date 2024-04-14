class Solution {
public:
    int minimumDeletions(vector<int>& nums) {
        int idx_max=-1;
        int idx_min=-1;
        int mini = INT_MAX;
        int maxi = INT_MIN;
        int n = nums.size();
        for(int i=0;i<n;i++){
            if(nums[i]<mini){
                mini = nums[i];
                idx_min = i;
            }

             if(nums[i]>maxi){
                maxi = nums[i];
                idx_max = i;
            }
        }
// Three posibilties of answer
       int num1 = max(idx_min+1,idx_max+1);// from front deletion only
       int num2 = max(n-idx_min,n-idx_max);// from back deletion only
       int num3 = min(idx_min+1,idx_max+1)+ min(n-idx_min,n-idx_max);  // from front and back deletion both
//minimum of all three possibilties
       return min(min(num1,num2),num3);

    }
};