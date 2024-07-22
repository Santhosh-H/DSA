//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int[] charCount = new int[26];

        // Populate the frequency array
        for (int i = 0; i < line.length(); i++) {
            charCount[line.charAt(i) - 'a']++;
        }

        // Find the maximum frequency and the corresponding character
        int maxCount = 0;
        char result = 'a';
        for (int i = 0; i < 26; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                result = (char) (i + 'a');
            } else if (charCount[i] == maxCount && (char) (i + 'a') < result) {
                result = (char) (i + 'a');
            }
        }

        return result;
    }
    
}