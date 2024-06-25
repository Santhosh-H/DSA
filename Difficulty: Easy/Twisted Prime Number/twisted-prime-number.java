//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isTwistedPrime(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
     // Method to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;  // 2 and 3 are prime
        if (num % 2 == 0 || num % 3 == 0) return false;  // eliminate multiples of 2 and 3
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;  // check factors of form 6k +/- 1
        }
        return true;
    }
    
    // Method to reverse the digits of a number
    public int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return reversed;
    }
    
    int isTwistedPrime(int N) {
        // code here
    
    // Method to reverse the digits of a number
    // Check if the number itself is prime
        if (!isPrime(N)) return 0;
        
        // Reverse the number
        int reversed = reverseNumber(N);
        
        // Check if the reversed number is also prime
        if (isPrime(reversed)) return 1;
        
        // If either the number or its reverse is not prime, return 0
        return 0;
    }
}
