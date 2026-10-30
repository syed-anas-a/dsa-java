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
    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }
    public int depth(TreeNode root) {
        if(root == null) return 0;
        int leftD = depth(root.left);
        if(leftD == -1) return -1;
        int rightD = depth(root.right);
        if(rightD == -1) return -1;
        if (Math.abs(leftD-rightD) > 1) return -1;
        return Math.max(leftD, rightD) + 1;
    }
}
