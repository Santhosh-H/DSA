//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        //int[] denominations = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
         int[] denominations = {1,2,5,10,20,50,100,200,500,2000};
        
        // List to store the result (coins/notes used)
        List<Integer> result = new ArrayList<>();
        
        // Iterate over each denomination
        for (int i = denominations.length-1; i >=0; i--) {
            // While the current denomination can fit into N
            while (N >= denominations[i]) {
                // Subtract the denomination from N
                N -= denominations[i];
                // Add the denomination to the result list
                result.add(denominations[i]);
            }
        }
        return result;
        
    }
}