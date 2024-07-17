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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        leaf1 = dfs(root1, leaf1);
        List<Integer> leaf2 = new ArrayList<>();
        leaf2 = dfs(root2, leaf2);

        return leaf1.equals(leaf2);
    }

    public List<Integer> dfs(TreeNode root, List<Integer> leaf) {
        if (root == null) return leaf;

        if (root.left == null && root.right == null) leaf.add(root.val);

        leaf = dfs(root.left, leaf);
        leaf = dfs(root.right, leaf);

        return leaf;
    }
}