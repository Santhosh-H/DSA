class Solution {
    public boolean isPalindrome(String s) {
        String normalizedStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Check if the normalized string is a palindrome
        int left = 0;
        int right = normalizedStr.length() - 1;
        
        while (left < right) {
            if (normalizedStr.charAt(left) != normalizedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}