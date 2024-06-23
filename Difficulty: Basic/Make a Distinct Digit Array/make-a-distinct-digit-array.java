//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
            Solution ob = new Solution();
            int[] ans = ob.common_digits(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] common_digits(int[] nums)
    {
        // code here
         HashSet<Integer> s = new HashSet<>();
        int l = nums.length;
        
        for (int i = 0; i < l; i++) {
            int n = nums[i]; // Corrected to use nums[i]
            while (n > 0) {
                int ok = n % 10;
                s.add(ok);
                n = n / 10;
            }
        }
        
        // Converting HashSet to array
        int[] ans = new int[s.size()];
        int count = 0;
        for (int i : s) {
            ans[count++] = i;
        }
        
        return ans;
    }
    
}