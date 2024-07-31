//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution ob = new Solution();
            
            System.out.println(ob.minFlips(S));
                        
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    public int minFlips(String S) {
        // Code here
        int n = S.length();
    int flipsPattern1 = 0;
    int flipsPattern2 = 0;
    
    // Check for pattern starting with '0' (i.e., 010101...)
    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) {
            if (S.charAt(i) != '0') flipsPattern1++;
        } else {
            if (S.charAt(i) != '1') flipsPattern1++;
        }
    }
    
    // Check for pattern starting with '1' (i.e., 101010...)
    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) {
            if (S.charAt(i) != '1') flipsPattern2++;
        } else {
            if (S.charAt(i) != '0') flipsPattern2++;
        }
    }
    
    // Return the minimum flips needed
    return Math.min(flipsPattern1, flipsPattern2);
    }
}