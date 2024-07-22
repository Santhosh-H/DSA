class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
        return false;
    }

    // Convert strings to character arrays
    char[] in = s.toCharArray();
    char[] check = t.toCharArray();

    // Sort the character arrays
    Arrays.sort(in);
    Arrays.sort(check);

    // Compare the sorted arrays
    for (int i = 0; i < in.length; i++) {
        if (in[i] != check[i]) {
            return false;
        }
    }

    return true;
        
    }
}