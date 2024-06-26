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

alernate approach using count sort 

// import java.util.*;

// public class DiagonalSort {
//     public static int[][] diagonalSort(int[][] mat) {
//         int m = mat.length;
//         int n = mat[0].length;
        
//         // Helper method to sort and set diagonal using counting sort
//         for (int d = 0; d < m; d++) {
//             countSortDiagonal(mat, d, 0);
//         }
//         for (int d = 1; d < n; d++) {
//             countSortDiagonal(mat, 0, d);
//         }
        
//         return mat;
//     }

//     private static void countSortDiagonal(int[][] mat, int startX, int startY) {
//         int m = mat.length;
//         int n = mat[0].length;
        
//         // Create a count array for the range [1, 100]
//         int[] count = new int[101];
        
//         // Traverse the diagonal and count the frequency of each element
//         int x = startX, y = startY;
//         while (x < m && y < n) {
//             count[mat[x][y]]++;
//             x++;
//             y++;
//         }
        
//         // Sort the diagonal by writing back the elements in sorted order
//         x = startX;
//         y = startY;
//         for (int num = 1; num <= 100; num++) {
//             while (count[num] > 0) {
//                 mat[x][y] = num;
//                 x++;
//                 y++;
//                 count[num]--;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[][] mat1 = {
//             {3, 3, 1, 1},
//             {2, 2, 1, 2},
//             {1, 1, 1, 2}
//         };
        
//         int[][] result1 = diagonalSort(mat1);
//         System.out.println(Arrays.deepToString(result1));
        
//         int[][] mat2 = {
//             {11, 25, 66, 1, 69, 7},
//             {23, 55, 17, 45, 15, 52},
//             {75, 31, 36, 44, 58, 8},
//             {22, 27, 33, 25, 68, 4},
//             {84, 28, 14, 11, 5, 50}
//         };
        
//         int[][] result2 = diagonalSort
