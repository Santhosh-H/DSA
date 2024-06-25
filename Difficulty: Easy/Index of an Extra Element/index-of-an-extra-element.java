//{ Driver Code Starts
import java.util.*;

class ExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n - 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.findExtra(n, a, b));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        int low = 0, high = arr1.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid < arr2.length && arr1[mid] == arr2[mid]) {
                // Extra element is to the right of mid
                low = mid + 1;
            } else {
                // Extra element is either at mid or to the left
                high = mid - 1;
            }
        }
        return low;

    }
}