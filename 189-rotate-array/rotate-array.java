class Solution {
    public static void reverse(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==1) return;
        k=k%n;
        int left=0;
        int right=n-1-k;
        reverse(nums,left,right);
        left=right+1;
        right=n-1;
        reverse(nums,left,right);
        left=0;
        right=n-1;
        reverse(nums,left,right);
    }
}