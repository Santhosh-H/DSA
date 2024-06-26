class Solution {
    public int minimumMoves(String s) {
        int ans=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                ans++;
                i=i+3;
            }
            else{
                i=i+1;
            }
        }
        return ans;
    }
}