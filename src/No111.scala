/**
  * Created by wqlin on 18-1-18 23:12.
  */
object No111 {
  def minDepth(root: TreeNode): Int = {
    def findMinDepth(depth: Int, level: List[TreeNode]): Int = {
      val res = level.find(t => t.left == null && t.right == null)
      if (res.isDefined) depth
      else {
        val buffer = new collection.mutable.ListBuffer[TreeNode]()
        level.foreach { t =>
          if (t.left != null) buffer += t.left
          if (t.right != null) buffer += t.right
        }
        findMinDepth(depth + 1, buffer.toList)
      }
    }

    if (root == null) 0
    else findMinDepth(1, List(root))
  }
}
