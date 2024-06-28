class Solution {
    public int strStr(String haystack, String needle) {
         // If the needle is empty, return 0 as per convention
        if (needle.isEmpty()) {
            return 0;
        }

        // Use indexOf to find the first occurrence of needle in haystack
        int index = haystack.indexOf(needle);

        return index;
    }
}