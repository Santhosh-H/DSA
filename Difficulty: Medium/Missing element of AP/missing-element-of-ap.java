//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        Solution solution = new Solution();
        while (t-- > 0) {
            String input = reader.readLine().trim();
            String[] parts = input.split("\\s+");
            int[] arr = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

            System.out.println(solution.findMissing(arr));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMissing(int[] arr) {
        // code here
        int n=arr.length;
        int a=arr[0];
        int an=arr[n-1];
        int d=(an-a)/n;
        int ans=0;
        for(int i=1;i<n;i++){
            ans=arr[i-1]+d;
            if(ans==arr[i])
            continue;
            else
            break;
        }
        return ans;
    }
}

///optimal solution using binary search chatgpt O(logn) time
public static int findMissingElement(int[] arr) {
        int n = arr.length;
        int d = (arr[n - 1] - arr[0]) / n;
        
        int low = 0, high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int expected = arr[0] + mid * d;
            
            if (arr[mid] == expected) {
                // The missing element is in the right half
                low = mid + 1;
            } else {
                // The missing element is in the left half
                high = mid - 1;
            }
        }
        
        // The missing element is the expected value at the position `low`
        return arr[0] + low * d;
    }
