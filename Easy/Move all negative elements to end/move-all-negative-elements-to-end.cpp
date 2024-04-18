//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
    public:
    void segregateElements(int arr[],int n)
    {
        
        if(n==0 || n==1){
            return;
        }
        int temp[n];
        int i=0;
        for(int x=0;x<n;x++){
            if(arr[x]>=0){
                temp[i]=arr[x];
                i++;
            }
        }
        for(int x=0;x<n;x++){
            if(arr[x]<0){
                temp[i]=arr[x];
                i++;
            }
        }
        for(int x=0;x<n;x++){
           
                arr[x]=temp[x];
            
        }
        
    }
};

//{ Driver Code Starts.
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n];
		for(int i=0;i<n;i++)
		cin>>a[i];
		Solution ob;
		ob.segregateElements(a,n);
		
        for(int i=0;i<n;i++)
        cout<<a[i]<<" ";
		cout<<endl;
	}
}

// } Driver Code Ends