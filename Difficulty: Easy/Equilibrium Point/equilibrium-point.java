//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            // taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");

            // adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();

            // calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    // arr: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

             // If there's only one element, it's the equilibrium point
        if (n == 1) {
            return 1;
        }

        // Calculate the total sum of the array
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        // Iterate through the array and find the equilibrium point
        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            // totalSum - arr[i] is the sum of elements to the right of the current index
            if (leftSum == (totalSum - arr[i] - leftSum)) {
                return i + 1; // Return the equilibrium point in 1-based indexing
            }
            leftSum += arr[i];
        }

        // If no equilibrium point is found, return -1
        return -1;
    }
}
