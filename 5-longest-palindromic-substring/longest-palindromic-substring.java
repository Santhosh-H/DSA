class Solution {
    public static String longestPalindromeOptimal(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public String longestPalindrome(String s) {
        return longestPalindromeOptimal(s);
        // if(s.length() <= 1) return s;
        // int max_len = 1;
        // int n = s.length();
        // int st = 0, end = 0;
        // // Odd length
        // for(int i = 0; i < n; i++){
        //     int l = i, r = i;
        //     while(l >= 0 && r < n){
        //         if(s.charAt(l) == s.charAt(r)){
        //             l--; r++;
        //         }else
        //             break;
        //     }
        //     int len = r-l-1;
        //     if(len > max_len){
        //         max_len = len;
        //         st = l+1;
        //         end = r-1;
        //     }
        // }
        
        // // Even length
        // for(int i = 0; i < n; i++){
        //     int l = i, r = i+1;
        //     while(l >= 0 && r < n){
        //         if(s.charAt(l) == s.charAt(r)){
        //             l--; r++;
        //         }else
        //             break;
        //     }
        //     int len = r-l-1;
        //     if(len > max_len){
        //         max_len = len;
        //         st = l+1;
        //         end = r-1;
        //     }
        // }
        
        // return s.substring(st, end + 1);
    }
}
