class Solution {
    public int lengthOfLongestSubstring(String s) {

        // brute force is also accepted in leetcode
        // int ans=0;
        // int maxi=0;
        // for(int i=0;i<s.length();i++){
        //     int []hash=new int[255];
        //     for(int j=i;j<s.length();j++){
        //             if(hash[s.charAt(j)]==1) break;
        //             ans=j-i+1;
        //             maxi=Math.max(ans,maxi);
        //             hash[s.charAt(j)]=1;
        //         }
        //     }
        
        //return maxi;

        // optimal approach 
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0; // To store the maximum length of substring found
        int start = 0; // Start pointer of the current window

        // Iterate through the string
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the map and its index is within the current window
            if (map.containsKey(currentChar) && map.get(currentChar) >= start) {
                start = map.get(currentChar) + 1; // Move the start pointer
            }

            // Update the last index of the character
            map.put(currentChar, end);

            // Calculate the length of the current window and update maxLength if necessary
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}