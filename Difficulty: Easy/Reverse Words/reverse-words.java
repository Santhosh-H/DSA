//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        //https://www.youtube.com/watch?v=glGZMqcSDW0
        String[] words = S.split("\\.");
        // Initialize a StringBuilder to construct the reversed string
        StringBuilder reversedString = new StringBuilder();
        
        // Iterate through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            // Add a dot after each word except the last one
            if (i != 0) {
                reversedString.append(".");
            }
        }
        
        return reversedString.toString();
    }
}