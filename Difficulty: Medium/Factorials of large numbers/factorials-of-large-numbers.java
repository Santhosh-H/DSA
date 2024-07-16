//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
import java.math.BigInteger;
import java.util.ArrayList;
class Solution {
    // Method to compute the factorial of a number using BigInteger
    public static BigInteger computeFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Method to convert a BigInteger to a list of digits
    public static ArrayList<Integer> convertToList(BigInteger num) {
        ArrayList<Integer> digitList = new ArrayList<>();
        String numStr = num.toString();
        for (char digit : numStr.toCharArray()) {
            digitList.add(Character.getNumericValue(digit));
        }
        return digitList;
    }

    // Method to compute the factorial and return the list of digits
    static ArrayList<Integer> factorial(int N) {
        BigInteger factorial = computeFactorial(N);
        return convertToList(factorial);
    }

}

//{ Driver Code Starts.

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val : ans) System.out.print(val);
            System.out.println();
        }
    }
}
// } Driver Code Ends