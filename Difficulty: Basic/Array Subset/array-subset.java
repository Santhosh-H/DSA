//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

//!frequencyMap.containsKey(num): This checks if the element num is not present in the frequencyMap.
	//If the element is not in the map, it means that a1 does not contain this element at all,
	//hence a2 cannot be a subset of a1.
	
        //frequencyMap.get(num) == 0: This checks if the count of the element num in frequencyMap is zero.
	//Even if the element exists in the map, if its count has been depleted to zero
	//(meaning all occurrences have already been matched by previous elements in a2), 
        //then we can't match the current occurrence of num in a2

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
       HashMap<Long, Integer> frequencyMap = new HashMap<>();
        
        // Count frequencies of each element in a1
        for (long num : a1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Check frequencies of each element in a2   
        for (long num : a2) {
            if (!frequencyMap.containsKey(num) || frequencyMap.get(num) == 0) {
                return "No";
            }
            frequencyMap.put(num, frequencyMap.get(num) - 1);
        }
        
        return "Yes";
    }
}
