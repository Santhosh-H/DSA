//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            char ch = read.readLine().charAt(0);
            int count = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            String result = ob.printString(s, ch, count);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String printString(String S, char ch, int count) {
       if (count == 0) {
            return S;
        }
        
        int occurrence = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ch) {
                occurrence++;
                if (occurrence == count) {
                    if (i == S.length() - 1) {
                        return "Empty string";
                    }
                    return S.substring(i + 1);
                }
            }
        }
        return "Empty string";
    }
}