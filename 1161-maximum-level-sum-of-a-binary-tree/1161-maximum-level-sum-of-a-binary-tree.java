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
    public int maxLevelSum(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            if (curr == null) {
                arr.add(sum);
                sum = 0;
                if (q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                sum += curr.val;

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        int idx = 0;
        int s = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > s) {
                idx = i + 1;
                s = arr.get(i);
            }
        }
        return idx;
    }
}