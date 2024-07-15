//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];

            for (long i = 0; i < n; i++) arr[(int)i] = sc.nextLong();

            System.out.println(new Solution().inversionCount(arr, (int)n));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
     private static long merge(long[] arr, int low, int mid, int high) {
        ArrayList<Long> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        // Modification 1: cnt variable to count the pairs:
        long cnt = 0;

        // storing elements in the temporary array in a sorted manner
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                cnt += (mid - left + 1); // Modification 2
                right++;
            }
        }

        // if elements on the left half are still left
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right half are still left
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transferring all elements from temporary to arr
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt; // Modification 3
    }

    public static long mergeSort(long[] arr, int low, int high) {
        long cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += merge(arr, low, mid, high);  // merging sorted halves
        return cnt;
    }
    static long inversionCount(long arr[], int n) {
        // Your Code Here
        return mergeSort(arr, 0, n - 1);
    }
}