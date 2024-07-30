//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.encode(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String encode(String s) {
        // code here
        StringBuffer sb=new StringBuffer();
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1) && i>0){
                count =count+1;
            }
            else if(s.charAt(i)!=s.charAt(i-1)){
                sb.append(s.charAt(i-1));
                sb.append(""+count);
                count=1;
            }
        }
          sb.append(s.charAt(s.length()-1));
          sb.append(""+count);
        // if(sb.charAt(sb.length()-2)==s.charAt(sb.length()-1)){
        //     int ans=Integer.parseInt(""+sb.charAt(sb.length()-1));
        //     ans=ans+1;
        //     String a=String.valueOf(ans);
        //     sb.replace(sb.length()-1,sb.length(),a);
        // }
        // else{
        //     sb.append(s.charAt(s.length()-1));
        //     sb.append("1");
        // }
        return sb.toString();
    }
}
    