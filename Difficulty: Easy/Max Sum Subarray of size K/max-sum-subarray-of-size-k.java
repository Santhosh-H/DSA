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
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long maxsum=0;
        long currsum=0;
        for(int i=0;i<K;i++){
            currsum+=Arr.get(i);
        }
        maxsum=currsum;
        for(int i=1;i<N-K+1;i++){
            currsum=currsum-Arr.get(i-1)+Arr.get(i+K-1);
            if(currsum>maxsum)
            maxsum=currsum;
        }
        return maxsum;
    }
}