import java.util.LinkedList;
/**
 * Created by wqlin on 18-2-18 11:26.
 */
public class No116 {
    class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    public void connect(TreeLinkNode root) {
        if (root != null) {
            LinkedList<TreeLinkNode> l = new LinkedList<>();
            l.add(root);
            TreeLinkNode node;
            while (!l.isEmpty()) {
                int len = l.size();
                for (int i = 0; i < len; i++) {
                    node = l.remove(0);
                    if (i + 1 < len)
                        node.next = l.getFirst();
                    if (node.left != null)
                        l.add(node.left);
                    if (node.right != null)
                        l.add(node.right);
                }
            }
        }
    }
}
