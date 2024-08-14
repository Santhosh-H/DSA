class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int maxi=0;
        for(int i=0;i<s.length();i++){
            int []hash=new int[255];
            for(int j=i;j<s.length();j++){
                    if(hash[s.charAt(j)]==1) break;
                    ans=j-i+1;
                    maxi=Math.max(ans,maxi);
                    hash[s.charAt(j)]=1;
                }
            }
        
        return maxi;
    }
}