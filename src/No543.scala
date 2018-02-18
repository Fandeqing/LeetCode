/**
  * Created by wqlin on 18-2-18 09:53.
  */
object No543 {
  def diameterOfBinaryTree(root: TreeNode): Int = {
    var res = 0

    def loop(root: TreeNode): Int = if (root == null) 0 else {
      val l = loop(root.left)
      val r = loop(root.right)
      res = res max (l + r)
      (l max r) + 1
    }

    loop(root)
    res
  }
}
