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
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        
        int leftH = getLeftHeight(root);
        int rightH = getRightHeight(root);

        if (leftH == rightH) {
            return (1 << leftH) - 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    private int getLeftHeight(TreeNode node) {
        if (node == null) return 0;
        return 1 + getLeftHeight(node.left);
    }

    private int getRightHeight(TreeNode node) {
        if (node == null) return 0;
        return 1 + getRightHeight(node.right);
    }
}