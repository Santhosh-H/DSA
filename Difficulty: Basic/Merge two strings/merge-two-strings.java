//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
        // code here
        StringBuilder result = new StringBuilder();
        
        int length1 = S1.length();
        int length2 = S2.length();
        int maxLength = Math.max(length1, length2);
        
        // Merge alternatively
        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                result.append(S1.charAt(i));
            }
            if (i < length2) {
                result.append(S2.charAt(i));
            }
        }
        
        return result.toString();
    }
} 