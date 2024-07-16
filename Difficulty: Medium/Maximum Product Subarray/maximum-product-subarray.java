//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long ans = arr[0];
    long maxPrefix = 1;
    long maxSuffix = 1;

    for (int i = 0; i < n; i++) {
        // Update prefix product
        maxPrefix = maxPrefix * arr[i];
        // Update suffix product
        maxSuffix = maxSuffix * arr[n - i - 1];

        // Update the answer with the maximum value found
        ans = Math.max(ans, Math.max(maxPrefix, maxSuffix));

        // Reset prefix and suffix to 1 if they become 0
        if (maxPrefix == 0) maxPrefix = 1;
        if (maxSuffix == 0) maxSuffix = 1;
    }
    return ans;

    }
}