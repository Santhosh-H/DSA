//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            int ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int sumOfDivisors(int N){
        // code here
        // Create an array to store the sum of divisors for each number
        int[] sum_div = new int[N + 1];
        
        // Use a sieve-like approach to calculate the sum of divisors for all numbers up to N
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                sum_div[j] += i;
            }
        }
        
        // Now find all divisors of N and sum their divisor sums
        int result = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                result += sum_div[i];        // i is a divisor
                if (i != N / i) {
                    result += sum_div[N / i]; // N / i is also a divisor, if it's not the same as i
                }
            }
        }
        
        return result;
    }
    
}