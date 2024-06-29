//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int x1 = Integer.parseInt(S[0]);
            int y1 = Integer.parseInt(S[1]);
            int x2 = Integer.parseInt(S[2]);
            int y2 = Integer.parseInt(S[3]);
            int x3 = Integer.parseInt(S[4]);
            int y3 = Integer.parseInt(S[5]);
            int x4 = Integer.parseInt(S[6]);
            int y4 = Integer.parseInt(S[7]);

            Solution ob = new Solution();
            System.out.println(ob.isSquare(x1,y1,x2,y2,x3,y3,x4,y4));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int distanceSquared(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }

    // Main function to check if the points form a square
    public static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        // Calculate squared distances between all pairs of points
        int[] distances = new int[6];
        distances[0] = distanceSquared(x1, y1, x2, y2);
        distances[1] = distanceSquared(x1, y1, x3, y3);
        distances[2] = distanceSquared(x1, y1, x4, y4);
        distances[3] = distanceSquared(x2, y2, x3, y3);
        distances[4] = distanceSquared(x2, y2, x4, y4);
        distances[5] = distanceSquared(x3, y3, x4, y4);

        // Sort the distances
        Arrays.sort(distances);

        // Check the conditions for a square
        boolean isSquare = distances[0] > 0 && // no zero distances
                           distances[0] == distances[1] && 
                           distances[1] == distances[2] && 
                           distances[2] == distances[3] && // four equal sides
                           distances[4] == distances[5] && // two equal diagonals
                           distances[4] == 2 * distances[0]; // diagonal is √2 times the side length squared

        return isSquare ? "Yes" : "No";
        
    }
};