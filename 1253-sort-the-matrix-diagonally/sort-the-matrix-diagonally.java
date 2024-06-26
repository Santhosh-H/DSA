class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        // Map to store the diagonals, where the key is the difference (i - j)
        Map<Integer, PriorityQueue<Integer>> diagonals = new HashMap<>();
        
        // Step 1: Extract the diagonals and store them in the map
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                diagonals.putIfAbsent(key, new PriorityQueue<>());
                diagonals.get(key).offer(mat[i][j]);
            }
        }
        
        // Step 2: Sort the diagonals and place them back into the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                mat[i][j] = diagonals.get(key).poll();
            }
        }
        
        return mat;
    }
}