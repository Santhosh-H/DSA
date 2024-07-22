class Solution {
    public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length()) {
    //     return false;
    // }

    // // Convert strings to character arrays
    // char[] in = s.toCharArray();
    // char[] check = t.toCharArray();

    // // Sort the character arrays
    // Arrays.sort(in);
    // Arrays.sort(check);

    // // Compare the sorted arrays
    // for (int i = 0; i < in.length; i++) {
    //     if (in[i] != check[i]) {
    //         return false;
    //     }
    // }

    // return true;
   if (s.length() != t.length()) {
        return false;
    }

    // Create a count array for each character (since they are lowercase English letters)
    int[] count = new int[26];

    // Count characters in both strings
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }

    // Check if all counts are zero
    for (int i = 0; i < 26; i++) {
        if (count[i] != 0) {
            return false;
        }
    }

    return true;
}
}