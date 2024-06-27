//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        String[] keypad = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        // List to store all possible words
        ArrayList<String> result = new ArrayList<>();

        // Edge case: if the input array is empty, return an empty list
        if (N == 0) return result;

        // Function to generate combinations
        generateCombinations(a, keypad, 0, "", result);

        return result;
    }

    // Helper function to generate combinations recursively
    static void generateCombinations(int[] a, String[] keypad, int index, String current, ArrayList<String> result) {
        // If the current combination is complete, add it to the result list
        if (index == a.length) {
            result.add(current);
            return;
        }

        // Get the corresponding string for the current digit
        String letters = keypad[a[index]];

        // Iterate through the string and recursively form combinations
        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(a, keypad, index + 1, current + letters.charAt(i), result);
        }
    }
}


