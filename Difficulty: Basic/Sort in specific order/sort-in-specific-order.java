//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution ob = new Solution();
            ob.sortIt(a, n);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
            output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
           List<Long> oddNumbers = new ArrayList<>();
        List<Long> evenNumbers = new ArrayList<>();

        // Separate odd and even numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddNumbers.add(arr[i]);
            } else {
                evenNumbers.add(arr[i]);
            }
        }

        // Sort odd numbers in reverse order
        Collections.sort(oddNumbers, Collections.reverseOrder());

        // Sort even numbers in natural order
        Collections.sort(evenNumbers);

        // Combine sorted odd and even numbers back into the array
        int index = 0;
        for (Long num : oddNumbers) {
            arr[index++] = num;
        }
        for (Long num : evenNumbers) {
            arr[index++] = num;
        }
    }
}