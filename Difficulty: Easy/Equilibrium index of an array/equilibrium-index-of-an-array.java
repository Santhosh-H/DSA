//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    int findEquilibrium(int[] arr) {
        // code
         int totalSum = 0; // Step 1: Calculate total sum of the array
        int leftSum = 0;  // To maintain the sum of the left side elements

        // Calculate the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        // Traverse the array and check for equilibrium index
        for (int i = 0; i < arr.length; i++) {
            // Right sum is total sum minus left sum minus current element
            totalSum -= arr[i]; // now totalSum represents the right sum

            if (leftSum == totalSum) {
                return i ; // return index in 1-based indexing
            }

            leftSum += arr[i]; // Update the left sum for the next iteration
        }

        return -1; // No equilibrium index found
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.findEquilibrium(arr);

            System.out.println(res);

            // System.out.println("~");
        }
    }
}

// } Driver Code Ends