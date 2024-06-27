//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.getNextEven(str));
            
        }
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public long getNextEven(String x)
    {
        // Your code goes here 
         char[] digits = x.toCharArray();

        // Find the next permutation
        if (!nextPermutation(digits)) {
            return -1;
        }

        while (true) {
            // Check if the number is even
            if ((digits[digits.length - 1] - '0') % 2 == 0) {
                return Long.parseLong(new String(digits));
            }
            // Find the next permutation
            if (!nextPermutation(digits)) {
                return -1;
            }
        }
    }

    private static boolean nextPermutation(char[] digits) {
        int n = digits.length;
        int i = n - 2;

        // Find the first decreasing element
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i == -1) {
            return false;
        }

        // Find the smallest element larger than digits[i] from the right side
        int j = n - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Swap them
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Reverse the sequence after the i-th position
        reverse(digits, i + 1, n - 1);
        return true;
    }

    private static void reverse(char[] digits, int start, int end) {
        while (start < end) {
            char temp = digits[start];
            digits[start] = digits[end];
            digits[end] = temp;
            start++;
            end--;
        }
    }
}