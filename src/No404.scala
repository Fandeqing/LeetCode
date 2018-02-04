/**
  * Created by wqlin on 18-2-4 16:40.
  */
object No404 {
  def sumOfLeftLeaves(root: TreeNode): Int = {
    def loop(root: TreeNode, isLeft: Boolean): Int = {
      if (root == null) 0
      else if (root.left == null && root.right == null && isLeft) root.value
      else loop(root.left, true) + loop(root.right, false)
    }
    loop(root, false)
  }
}
