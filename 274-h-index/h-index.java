class Solution {
    public int hIndex(int[] citations) {
          Arrays.sort(citations);
        
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            // Number of papers with at least citations[i] citations
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }
}