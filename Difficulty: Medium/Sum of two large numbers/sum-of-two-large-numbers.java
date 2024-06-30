//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String findSum(String X, String Y) {
    int m = X.length();
    int n = Y.length();
    int maxLength = Math.max(m, n);
    
    // Initialize variables
    int[] result = new int[maxLength + 1];
    int carry = 0;
    
    // Traverse both strings from right to left
    for (int i = 0; i < maxLength; i++) {
        int digit_X = (i < m) ? X.charAt(m - 1 - i) - '0' : 0;
        int digit_Y = (i < n) ? Y.charAt(n - 1 - i) - '0' : 0;
        
        int sum = digit_X + digit_Y + carry;
        result[i] = sum % 10;
        carry = sum / 10;
    }
    
    // If there's any carry left, add it
    if (carry > 0) {
        result[maxLength] = carry;
        maxLength++;
    }
    
    // Construct the result string
    StringBuilder sb = new StringBuilder();
    for (int i = maxLength - 1; i >= 0; i--) {
        sb.append(result[i]);
    }
    
    // Remove leading zeros if any
    while (sb.length() > 1 && sb.charAt(0) == '0') {
        sb.deleteCharAt(0);
    }
    
    return sb.toString();
}
    
}