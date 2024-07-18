//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer>l=new ArrayList<Integer>();
        int left=0,top=0;
        int right=c-1,buttom=r-1;
        while(left<=right && top<=buttom){
            
            for(int i=left;i<=right;i++)
                l.add(matrix[top][i]);
            
            top++;
            
            for(int i=top;i<=buttom;i++)
                l.add(matrix[i][right]);
            
            right--;
            
            if(top<=buttom){
            for(int i=right;i>=left;i--)
            l.add(matrix[buttom][i]);
            }
            buttom--;
            if(left<=right){
            for(int i=buttom;i>=top;i--)
            l.add(matrix[i][left]);
            }
            left++;
            
        }
        return l;
    }
}
