//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std;

// } Driver Code Ends

class Solution{
public:
    int evenlyDivides(int N){
        int temp;
        int rem,count=0;
        temp=N;
        while(N!=0){
            rem=N%10;
            if(rem==0){
                N=N/10;
            }
            else{
            if(temp%rem==0)
            count++;
            N=N/10;
            
        }}
        return count;
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin>>N;
        Solution ob;
        cout << ob.evenlyDivides(N) << endl;
    }
    return 0; 
}
// } Driver Code Ends