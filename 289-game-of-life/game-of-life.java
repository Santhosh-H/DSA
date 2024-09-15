class Solution {
   private int findlife(int i, int j, int[][] ans) {
    int live = 0;
    int rows = ans.length;
    int cols = ans[0].length;

    // Define the 8 possible directions (row offset, col offset)
    int[][] directions = {
        {-1, -1}, {-1, 0}, {-1, 1}, // Top-left, Top, Top-right
        {0, -1},          {0, 1},   // Left,         Right
        {1, -1}, {1, 0}, {1, 1}     // Bottom-left, Bottom, Bottom-right
    };

    // Iterate over all 8 possible directions
    for (int[] dir : directions) {
        int newRow = i + dir[0];
        int newCol = j + dir[1];

        // Check if the neighbor is within bounds
        if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
            live += ans[newRow][newCol]; // Count live neighbors
        }
    }

    return live;
}

    public void gameOfLife(int[][] board) {
        int ans[][]=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                ans[i][j]=board[i][j];
            }
        }
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int live=findlife(i,j,ans);
                int check=ans[i][j];
                if(check==0 && live==3){
                    board[i][j]=1;
                }
                else if(check==1 && live<2){
                    board[i][j]=0;
                }
                else if(check==1 && (live==2 || live==3)){
                    board[i][j]=1;
                }
                else if(check==1 && live>3){
                    board[i][j]=0;
                }
            }
        }
    }
}