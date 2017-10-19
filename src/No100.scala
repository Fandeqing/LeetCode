/**
  * Created by wqlin on 17-10-19 13:08.
  */
object No100 {
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    if (p != null && q != null)
      p._value == q._value && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    else if (p != null || q != null)
      false
    else
      true
  }
}
