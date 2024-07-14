class Solution {
    public int findDuplicate(int[] nums) {
        // brute force solution is using two for loop.
        // another approach is using set which uses extra space.
        // Now this problem can be solved using loop in linkedlist kinda
        int slow=0,fast=0;
        do{
        slow=nums[slow];
        fast=nums[nums[fast]];
        }while(slow!=fast);
    
    slow=0;
    while(slow!=fast){
        slow=nums[slow];
        fast=nums[fast];
    }
    return slow;
    }
}