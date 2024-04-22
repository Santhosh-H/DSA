//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// Function to return minimum number of jumps to end of array

class Solution{
  public:
    int minJumps(int arr[], int n){
        // Your code here
    int range = arr[0];
    int ans = 0;
    int i = 0;
    if(n==1){
        return 0;
    }
    while(range<n-1){
        
        int temp = range;
        
        while(i<n && i<=range){
            temp = max(temp,arr[i]+i);
            i++;
        }
        
        if(temp==range && i<n){
            return -1;
        }
        
        range = temp;
        ans++;
        
    }
    
    return ans+1;
    }
};


//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,i,j;
        cin>>n;
        int arr[n];
        for(int i=0; i<n; i++)
            cin>>arr[i];
        Solution obj;
        cout<<obj.minJumps(arr, n)<<endl;
    }
    return 0;
}

// } Driver Code Ends