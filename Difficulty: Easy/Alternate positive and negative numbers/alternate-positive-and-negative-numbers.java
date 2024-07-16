//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
         List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Separate positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        int i = 0, j = 0, k = 0;

        // Alternate positive and negative numbers
        while (i < pos.size() && j < neg.size()) {
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
        }

        // If there are remaining positive numbers
        while (i < pos.size()) 
            arr[k++] = pos.get(i++);
        

        // If there are remaining negative numbers
        while (j < neg.size()) 
            arr[k++] = neg.get(j++);
    }
}