class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int top =0;
        int left=0;
        int bottom=n-1;
        int right=m-1;
        List<Integer> l=new ArrayList<Integer>();
        
        while(left<=right && top<=bottom){
            //left to right
            for(int i=left;i<=right;i++)
            l.add(matrix[top][i]);
            
            top++;
            //top to bottom
            for(int i=top;i<=bottom;i++)
            l.add(matrix[i][right]);

            right--;
            //left to right
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                    l.add(matrix[bottom][i]);
            }

            bottom--;
            //bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                l.add(matrix[i][left]);
            }

            left++;

        }
        return l;
    }
}