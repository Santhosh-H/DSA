//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String string1 = read.readLine();
            String string2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(string1,string2) );
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution{
    static String removeChars(String string1, String string2){
        // code here
        HashSet<Character> removeSet = new HashSet<>();
        for (char ch : string2.toCharArray()) {
            removeSet.add(ch);
        }

        // StringBuilder to store the result characters
        StringBuilder result = new StringBuilder();

        // Iterate through each character in string1
        for (char ch : string1.toCharArray()) {
            // If the character is not in the removeSet, append it to the result
            if (!removeSet.contains(ch)) {
                result.append(ch);
            }
        }

        // Convert StringBuilder to string and return
        return result.toString();
    }
}