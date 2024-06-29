class Solution {
    public int matrixSum(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int sum = 0;
        //https://www.youtube.com/watch?v=GkbqPsHp08I
        for(int i=0;i<n;i++){
            Arrays.sort(nums[i]);
        }
        for(int i=0;i<m;i++){//colunm
            int curr=0;
            for(int j=0;j<n;j++){//row
                curr=Math.max(curr,nums[j][i]);
            }
            sum=sum+curr;
        }
    return sum;
       
}
}