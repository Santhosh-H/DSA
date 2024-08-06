class Solution {
    public boolean isPalindrome(String s) {
        // // time O(N) and space also O(N)
        // String normalizedStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // // Check if the normalized string is a palindrome
        // int left = 0;
        // int right = normalizedStr.length() - 1;
        
        // while (left < right) {
        //     if (normalizedStr.charAt(left) != normalizedStr.charAt(right)) {
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        
        // return true;

        //optimal approach O(N) and space O(1)
         int left = 0;
        int right = s.length() - 1;

        // Process the string from both ends towards the center
        while (left < right) {
            // Move the left pointer to the next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Move the right pointer to the previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare the characters at the current pointers
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // If they don't match, it's not a palindrome
            }

            // Move both pointers towards the center
            left++;
            right--;
        }

        return true; // If all character comparisons are valid, it's a palindrome

    }
}