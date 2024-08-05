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
