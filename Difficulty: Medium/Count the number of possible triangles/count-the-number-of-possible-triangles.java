//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        while(t > 0)
        {
            //taking elements count
            int n = sc.nextInt();
            
            //creating an array of length n
            int arr[] = new int[n];
            
            //adding elements to the array
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            
            //creating an object of class Solutions
            Solution ob = new Solution();
            
            //calling the method findNumberOfTriangles()
            //of class Solutions and printing the results
            System.out.println(ob.findNumberOfTriangles(arr,n));
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        //sorting is the key here and do check the utube video to again understand the concept
        // a+b>c so only sorting 
        // fixing c constant   https://www.youtube.com/watch?v=XGzCUpy_aFk
         Arrays.sort(arr);
        int count = 0;

        // Fix the third side one by one and use two pointers for the other two sides
        for (int i = n - 1; i >= 1; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                // If it's possible to form a triangle
                if (arr[left] + arr[right] > arr[i]) {
                    // All elements between left and right can form a triangle with arr[right] and arr[i]
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }
}
