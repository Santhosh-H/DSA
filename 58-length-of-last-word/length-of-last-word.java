class Solution {
    public int lengthOfLastWord(String s) {
        String S=s.trim();
        int i=S.length()-1;
        int count=0;
        while(i>=0){
            if(S.charAt(i)==' '){
                break;
            }
            else{
                count=count+1;
            }
            i--;
        }
        return count;
    }
}