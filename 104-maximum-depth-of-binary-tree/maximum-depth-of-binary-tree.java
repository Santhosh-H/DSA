/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int ans(TreeNode root) {
    if (root == null) return 0; // Base case: an empty tree has depth 0
    int left = ans(root.left);
    int right = ans(root.right);
    return 1 + Math.max(left, right); // Depth is 1 plus the maximum of the left and right subtree depths
}

public int maxDepth(TreeNode root) {
    return ans(root); // Call the helper function with the root node
}

}