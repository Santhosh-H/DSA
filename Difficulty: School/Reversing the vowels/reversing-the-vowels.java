//{ Driver Code Starts
//Initial Template for Java

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
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
      if (s == null || s.isEmpty()) {
        return s;
    }
    
    char[] chars = s.toCharArray();
    int left = 0, right = chars.length - 1;
    String vowels = "aeiouAEIOU";
    
    while (left < right) {
        // Move left pointer to the first vowel from the start
        while (left < right && vowels.indexOf(chars[left]) == -1) {
            left++;
        }
        
        // Move right pointer to the first vowel from the end
        while (left < right && vowels.indexOf(chars[right]) == -1) {
            right--;
        }
        
        // Swap vowels
        if (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
    
    return new String(chars);
    }
}