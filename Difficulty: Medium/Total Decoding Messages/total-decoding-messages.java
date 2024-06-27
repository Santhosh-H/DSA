//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountWays(String str)
    {
        // code here
           // Constants
        final int MOD = 1000000007;
        
        // Length of the input string
        int n = str.length();
        
        // Handle edge case of empty string
        if (n == 0) return 0;
        
        // DP array to store the number of ways to decode substring ending at index i
        long[] dp = new long[n + 1];
        
        // Base case: there is one way to decode an empty string
        dp[0] = 1;
        
        // Fill the DP array
        for (int i = 1; i <= n; i++) {
            // Single digit decode
            if (str.charAt(i - 1) >= '1' && str.charAt(i - 1) <= '9') {
                dp[i] = dp[i - 1];
            }
            
            // Two digit decode
            if (i > 1) {
                int twoDigit = Integer.parseInt(str.substring(i - 2, i));
                if (twoDigit >= 10 && twoDigit <= 26) {
                    dp[i] = (dp[i] + dp[i - 2]) % MOD;
                }
            }
        }
        
        // Return the number of ways to decode the entire string
        return (int) dp[n];
    }
}