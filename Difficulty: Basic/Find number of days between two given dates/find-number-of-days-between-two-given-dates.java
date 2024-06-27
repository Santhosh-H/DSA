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
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            
            int d1 = Integer.parseInt(S1[0]);
            int m1 = Integer.parseInt(S1[1]);
            int y1 = Integer.parseInt(S1[2]);
            
            int d2 = Integer.parseInt(S2[0]);
            int m2 = Integer.parseInt(S2[1]);
            int y2 = Integer.parseInt(S2[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.noOfDays(d1,m1,y1,d2,m2,y2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    private static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    static int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 
                           31, 31, 30, 31, 30, 31};
        
        // Calculate total days from 01/01/0001 to d1/m1/y1
        int days1 = daysFromStart(d1, m1, y1, monthDays);
        // Calculate total days from 01/01/0001 to d2/m2/y2
        int days2 = daysFromStart(d2, m2, y2, monthDays);
        
        // Return the difference
        return Math.abs(days2 - days1);
    }
    
    // Function to calculate total days from 01/01/0001 to d/m/y
    private static int daysFromStart(int d, int m, int y, int[] monthDays) {
        int days = d; // days in current month
        
        // Add days for previous months in the current year
        for (int i = 1; i < m; i++) {
            days += monthDays[i - 1];
        }
        
        // Add one day if current year is a leap year and February has passed
        if (m > 2 && isLeap(y)) {
            days += 1;
        }
        
        // Add days for previous years
        for (int i = 1; i < y; i++) {
            if (isLeap(i)) {
                days += 366;
            } else {
                days += 365;
            }
        }
        
        return days;
    }

};