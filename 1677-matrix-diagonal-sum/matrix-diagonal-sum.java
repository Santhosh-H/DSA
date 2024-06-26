class Solution {
    public int diagonalSum(int[][] mat) {
        int ans=0;
        int n = mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //i+j==n-1 is to find the secondary diaongal
                if( i==j || (i+j==n-1)){
                    ans=ans+mat[i][j];
                }
            }
        }
        return ans;
    }
}