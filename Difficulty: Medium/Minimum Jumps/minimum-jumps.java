//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr, size));
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr, int n) {
        // your code here
      int jumps = 0;
      int currEnd = 0; // Current end of the reachable area
      int currstart = 0; // Farthest reachable position from the current position
      
      for (int i = 0; i < n - 1; i++) {
          // Update currstart
          if (i + arr[i] > currstart) {
              currstart = i + arr[i];
          }
          
          // If current position reaches currEnd, update currEnd and increment jumps
          if (i == currEnd) {
              jumps++;
              currEnd = currstart;

              
              // If the current end is beyond the last index, return the number of jumps
              if (currEnd >= n - 1) {
                  return jumps;
              }
          }
        // condition used in GFG minimum jump game same question
        //   // If we encounter a 0 in the array and cannot move further, return -1
           if (arr[i] == 0 && i == currEnd) {
               return -1;
           }
      }
      
      return jumps;
    }
}