//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        //  if (arr == null || arr.length == 0) {
        //     return "-1";
        // }
        
        // String prefix = arr[0];
        
        // for (int i = 1; i < arr.length; i++) {
        //     while (arr[i].indexOf(prefix) != 0) {
        //         prefix = prefix.substring(0, prefix.length() - 1);
        //         if (prefix.isEmpty()) {
        //             return "-1";
        //         }
        //     }
        // }
        
        // return prefix;
// youtube approach 
    StringBuilder result = new StringBuilder();
    // Sort the array
    Arrays.sort(arr);
    // Get the first and last strings
    char[] first = arr[0].toCharArray();
    char[] last = arr[arr.length - 1].toCharArray();

    // Start comparing
    for (int i = 0; i < first.length; i++) {
      if (first[i] != last[i])
        break;
      result.append(first[i]);
    }
    if(result.length()==0) result.append("-1");
    return result.toString();
    
    }
}
