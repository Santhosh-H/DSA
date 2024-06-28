//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)throws IOException
    {
        
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int[] arr = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0; i < n; ++i)
                arr[i] = Integer.parseInt(s[i]);

    		out.println (new Solution().closestToZero (arr, n));
        }
        out.close();
        
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int closestToZero (int arr[], int n)
    {
        // your code here
        //https://www.youtube.com/watch?v=B12N9fq03sM
        // Edge case: If there are exactly two elements
        Arrays.sort(arr);
        
        if(n < 2)
        return 2*arr[0];
        
        else if(arr[0] > 0)
        return arr[0]+arr[1];
        
        else if(arr[n-1] < 0){
        
        return arr[n - 1] + arr[n - 2];
        
        }
                
        
        int lo = 0 , hi = n-1 , minSum = Integer.MAX_VALUE;
        
        while(lo < hi){
            
            int sum = arr[lo]+arr[hi];
            
            if(Math.abs(sum) < Math.abs(minSum)){
                       

            minSum = sum;
            
            }
            
            if(Math.abs(sum) == Math.abs(minSum))
            minSum = Math.max(minSum , sum);
            
            if(sum < 0)
            lo++;
            
            else 
            hi--;
        }
        
        return minSum;
    }
}