//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            v = new Solution().nextGreatest(arr);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
                int n = arr.length;
        int[] result = new int[n];
        
        // Initialize the maximum element on the right side as -1
        int maxFromRight = -1;
        
        // Traverse the array from the second last element to the first
        for (int i = n - 1; i >= 0; i--) {
            // Store the current element before changing it
            int current = arr[i];
            
            // Assign the max element on its right to the result array
            result[i] = maxFromRight;
            
            // Update the maxFromRight
            if (current > maxFromRight) {
                maxFromRight = current;
            }
        }
        
        // Convert the result array to an ArrayList
        ArrayList<Integer> resultList = new ArrayList<>(n);
        for (int value : result) {
            resultList.add(value);
        }
        
        return resultList;
    }
}