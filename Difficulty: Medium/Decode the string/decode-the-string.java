//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        // code here
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int currentNumber = 0;
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(currentNumber);
                stringStack.push(currentString);
                currentNumber = 0;
                currentString = "";
            } else if (ch == ']') {
                String decodedSubstring = currentString;
                currentString = stringStack.pop();
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    currentString += decodedSubstring;
                }
            } else {
                currentString += ch;
            }
        }
        
        return currentString;
    }
}
