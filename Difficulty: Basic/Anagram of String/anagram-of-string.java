//{ Driver Code Starts
//saksham raj seth
import java.util.*;
import java.util.stream.*;

class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
        {
        //add code here.
       int[] charCount = new int[26];
    
    // Increment the count for each character in s1
    for (int i = 0; i < s.length(); i++) {
        charCount[s.charAt(i) - 'a']++;
    }
    
    // Decrement the count for each character in s2
    for (int i = 0; i < s1.length(); i++) {
        charCount[s1.charAt(i) - 'a']--;
    }
    
    // Calculate the total number of deletions required
    int deletions = 0;
    for (int i = 0; i < 26; i++) {
        deletions += Math.abs(charCount[i]);
    }
    
    return deletions;
        }
}