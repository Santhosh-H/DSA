//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S1 = read.readLine().trim(); 
            String S2 = read.readLine().trim(); 
            Solution obj = new Solution();
            if(obj.metaStrings(S1, S2))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean metaStrings(String S1, String S2) 
    { 
        // code here
        int freq[]=new int[26];
        int count=0;
        if(S1.length()!=S2.length()) return false;
        if(S1.equals(S2)) return false;
        
        for(int i=0;i<S1.length();i++){
            freq[S1.charAt(i)-'a']++;
            freq[S2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
            if(freq[i]!=0) return false;
        
        for(int i=0;i<S1.length();i++)
            if(S1.charAt(i)!=S2.charAt(i)) count++;
        
        return (count==2);
    }
} 


