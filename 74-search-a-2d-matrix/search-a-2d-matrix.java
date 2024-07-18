class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //optimal code check note for brute and better solution
        int n=matrix.length; //row
        int m=matrix[0].length; //col
        int low =0;
        int high=n*m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target)
            return true;
            else if(matrix[row][col]<target)
            low=mid+1;
            else
            high=mid-1;
        }
        return false;
    }
}