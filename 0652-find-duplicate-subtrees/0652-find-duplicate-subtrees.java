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
    int curId = 1;

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> serialToId = new HashMap<>();
        Map<Integer, Integer> idToCount = new HashMap<>();
        List<TreeNode> ans = new LinkedList<>();
        postorder(root, serialToId, idToCount, ans);
        return ans;
    }
    
    private int postorder(TreeNode root, Map<String, Integer> serialToId, Map<Integer, Integer> idToCount, List<TreeNode> res) {
        if (root == null) return 0;
        int l = postorder(root.left, serialToId, idToCount, res);
        int r = postorder(root.right, serialToId, idToCount, res);
        String curSerial = l + "," + root.val + "," + r;
        int sid = serialToId.getOrDefault(curSerial, curId);
        if (sid == curId) curId++;
        serialToId.put(curSerial, sid);
        idToCount.put(sid, idToCount.getOrDefault(sid, 0) + 1);
        if (idToCount.get(sid) == 2) res.add(root);
        return sid;
    }
}