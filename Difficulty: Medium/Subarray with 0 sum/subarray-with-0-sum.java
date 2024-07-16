//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
			//code
			
		//taking input using class Scanner
		Scanner scan = new Scanner(System.in);
		
		//taking total number of testcases
		int t = scan.nextInt();
		while(t>0)
		{
		    //taking total count of elements
		    int n = scan.nextInt() ;
		    
		    //Declaring and Initializing an array of size n
		    int arr[] = new int[n];
		    
		    //adding elements to the array
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    
		    t--;
		    
		     //calling the method findSum
		     //and print "YES" or "NO" based on the result
		     System.out.println(new Solution().findsum(arr,n)==true?"Yes":"No");
		}
	}
	
	
}
// } Driver Code Ends


class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
         // Initialize an empty set to store the cumulative sums
        HashSet<Integer> cumSumSet = new HashSet<>();

        // Initialize the cumulative sum
        int cumSum = 0;

        // Traverse the array
        for (int num : arr) {
            // Add the current element to the cumulative sum
            cumSum += num;

            // Check if cumulative sum is 0 or if it has been seen before
            if (cumSum == 0 || cumSumSet.contains(cumSum)) {
                return true;
            }

            // Add the cumulative sum to the set
            cumSumSet.add(cumSum);
        }

        // If no subarray with zero sum is found
        return false;
    }
}