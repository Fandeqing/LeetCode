import java.util.Stack;

/**
 * Created by wqlin on 18-1-21 09:23.
 */
public class No173 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class BSTIterator {
        private Stack<TreeNode> s = new Stack<>();

        public BSTIterator(TreeNode root) {
            TreeNode r = root;
            while (r != null) {
                s.push(r);
                r = r.left;
            }
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            return !s.empty();
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            TreeNode top = s.pop();
            int result = top.val;
            if (top.right != null) {
                top = top.right;
                while (top != null) {
                    s.push(top);
                    top = top.left;
                }
            }
            return result;
        }
    }
}
