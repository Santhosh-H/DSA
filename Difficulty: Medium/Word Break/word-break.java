//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> dictionary = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            dictionary.add(p);
                        }
                    String s = sc.next();
                    Solution obj = new Solution();  
                    System.out.println(obj.wordBreak(n, s, dictionary));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //https://www.youtube.com/watch?v=LPs6Qo5qlJM&list=TLPQMjcwNjIwMjQfnCvV-b8R2A&index=2
     public static int wordBreak(int n, String s, ArrayList<String> dictionary) {
        Map<String, Boolean> map = new HashMap<>();
        return wordBreakHelper(s, dictionary, map) ? 1 : 0;
    }

    private static boolean wordBreakHelper(String s, ArrayList<String> dictionary, Map<String, Boolean> map) {
        if (dictionary.contains(s))
            return true;
        if (map.containsKey(s))
            return map.get(s);
        for (int i = 1; i <= s.length(); i++) {
            String left = s.substring(0, i);
            if (dictionary.contains(left) && wordBreakHelper(s.substring(i), dictionary, map)) {
                map.put(s, true);
                return true;
            }
        }
        map.put(s, false);
        return false;
    }
    
}
