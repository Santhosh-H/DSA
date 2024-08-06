//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        //optimal solution
    //     int[] ans=new int[2];
    //     long sum=0;
    //     long sn=(n*(n+1))/2;
    //     long sumofsquare=0;
    //     long sumofNsquare=(n*(n+1)*(2*n+1))/6;
    //     for(int i=0;i<n;i++){
    //         sum=sum+arr[i];
    //         sumofsquare=sumofsquare+ (long)arr[i]*(long)arr[i];
    //     }
    //     long val1=sum-sn; //x-y =val1
    //     long val2= sumofsquare-sumofNsquare; //x^2 - y^2
    //     val2=val2/val1;  //x+y= something ans
    //     //solving x-y and x+y;
    //     long x= (val1+val2)/2;
    //     long y= x-val1;
    //     ans[0]=(int)x;
    //     ans[1]=(int)y;
    //  return ans;
     long SN = (long)n * (n + 1) / 2;  // Sum of first n natural numbers
    long S2N = (long)n * (n + 1) * (2 * n + 1) / 6;  // Sum of squares of first n natural numbers

    // Calculate S and S2:
    long S = 0, S2 = 0;
    for (int i = 0; i < n; i++) {
        S += arr[i];
        S2 += (long)arr[i] * arr[i];
    }

    // S - SN = X - Y:
    long val1 = S - SN;

    // S2 - S2N = X^2 - Y^2:
    long val2 = S2 - S2N;

    // Find X + Y = (X^2 - Y^2) / (X - Y):
    val2 = val2 / val1;

    // Find X and Y:
    // X = ((X + Y) + (X - Y)) / 2
    // Y = X - (X - Y)
    long x = (val1 + val2) / 2;
    long y = x - val1;

    return new int[]{(int)x, (int)y};
    }
}