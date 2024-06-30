//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(n, a);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int n, int a[]) {
        // code here
         ArrayList<Integer> result = new ArrayList<>();
        int maxSum = -1; // Initialize to -1 to handle cases with all negative numbers
        int currentSum = 0;
        int tempStart = 0;

        int maxStart = 0;
        int maxEnd = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                currentSum += a[i];
                if (currentSum > maxSum || (currentSum == maxSum && (i - tempStart > maxEnd - maxStart))) {
                    maxSum = currentSum;
                    maxStart = tempStart;
                    maxEnd = i;
                }
            } else {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        if (maxSum == -1) {
            result.add(-1);
        } else {
            for (int i = maxStart; i <= maxEnd; i++) {
                result.add(a[i]);
            }
        }

        return result;
    }
}