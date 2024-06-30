class Solution {
    //https://www.youtube.com/watch?v=b1trD1aVZ5k
    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        // If index equals the length of the word, we have found the word
        if (index == word.length()) {
            return true;
        }

        // Check if we are out of bounds or if the current cell does not match the word's character
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        // Temporarily mark the cell as visited
        char temp = board[i][j];
        board[i][j] = ' ';

        // Explore the four possible directions: up, down, left, right
        boolean found = dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1);

        // Revert the cell back to its original state
        board[i][j] = temp;

        return found;}
    public boolean exist(char[][] board, String word) {
         int rows = board.length;
        int cols = board[0].length;

        // Check each cell to see if we can start the word from there
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}