//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        //https://www.youtube.com/watch?v=Du881K7Jtk8
         Stack<Long> st = new Stack<>();
        // Array to store the answer
        long[] ans = new long[n];

        // Iterate over the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // While stack is not empty and the top of the stack is less than or equal to arr[i]
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            // If stack is not empty, the next greater element is on the top of the stack
            if (!st.isEmpty()) {
                ans[i] = st.peek();
            } else {
                // If stack is empty, there is no greater element
                ans[i] = -1;
            }
            // Push the current element to the stack
            st.push(arr[i]);
        }
        return ans;
    } 
}