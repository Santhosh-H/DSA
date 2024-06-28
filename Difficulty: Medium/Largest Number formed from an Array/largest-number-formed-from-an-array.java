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
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(n, arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(int n, String[] arr) {
        // code here
        //https://www.youtube.com/watch?v=qEIGhVtZ-sg
         quicksort(arr, 0, n - 1);
        
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        
        return sb.toString();
    }
    
    void quicksort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }
    
    int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = (low - 1);
        
        for (int j = low; j < high; j++) {
            String order1 = arr[j] + pivot;
            String order2 = pivot + arr[j];
            if (order1.compareTo(order2) > 0) {
                i++;
                
                // Swap arr[i] and arr[j]
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap arr[i + 1] and arr[high] (or pivot)
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    }
