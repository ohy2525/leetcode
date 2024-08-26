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
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        find(root);
        return max;
    }

    private int find(TreeNode node) {
        if (node == null) return 0;

        int left = find(node.left);
        int right = find(node.right);

        int curMax = Math.max(node.val + left, node.val + right);
        max = Math.max(max, node.val + left + right);
        max = Math.max(max, curMax);

        return Math.max(curMax, 0);
    }
}