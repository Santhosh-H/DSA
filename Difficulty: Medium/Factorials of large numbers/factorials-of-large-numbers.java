//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
import java.math.BigInteger;
import java.util.ArrayList;
class Solution {
   static ArrayList<Integer> factorial(int N) {
        // code here
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= N; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        // Convert the BigInteger result to a list of digits
        ArrayList<Integer> digitList = new ArrayList<>();
        String numStr = result.toString();
        for (char digit : numStr.toCharArray()) {
            digitList.add(Character.getNumericValue(digit));
        }

        return digitList;
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
