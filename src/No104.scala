/**
  * Created by wqlin on 17-11-15 20:26.
  */
object No104 {
  def maxDepth(root: TreeNode): Int =
    if (root == null) 0
    else {
      val (l, r) = (maxDepth(root.left), maxDepth(root.right))
      (l max r) + 1
    }
}
