/**
 * Created by wqlin on 18-3-20 20:27.
 */
public class No235 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int val, v1 = p.val, v2 = q.val;
        while (root != null) {
            val = root.val;
            if (v1 < val && v2 < val)
                root = root.left;
            else if (v1 > val && v2 > val)
                root = root.right;
            else
                break;
        }
        return root;
    }
}
