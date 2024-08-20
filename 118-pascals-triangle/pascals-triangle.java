class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> l = new ArrayList<>();
    
    for (int i = 0; i < numRows; i++) {
        List<Integer> inner = new ArrayList<>();
        int ans = 1;
        inner.add(ans);
        
        for (int j = 1; j <= i; j++) {
            ans = ans * (i - j + 1) / j;
            inner.add(ans);
        }
        
        l.add(inner);
    }
    
    return l;
    }
}