//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    int arr [] = new int[n];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<n;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    obj.modifyAndRearrangeArr(arr, n);
		    for(int i=0; i< n;i++){
		        System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}
	}
}



// } Driver Code Ends


//User function Template for Java


class Solution{
    void modifyAndRearrangeArr (int arr[], int n) {
        // Complete the function
        // Step 1: Modify the array
        for (int i = 0; i < n - 1; i++) { // Use n - 1 instead of n
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
                i++; // Skip the next element as it has been zeroed out
            }
        }
        
        // Step 2: Rearrange the array
        int j = 0; // j keeps track of the position where the next non-zero element should go
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // Move j to the next position
                j++;
            }
    }
    
    }
}


