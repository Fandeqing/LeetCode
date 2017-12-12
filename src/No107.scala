/**
  * Created by wqlin on 17-10-26 08:33.
  */
object No107 {
  def levelOrderBottom(root: TreeNode): List[List[Int]] = {
    @annotation.tailrec
    def levelOrderBottom(curLevel: List[TreeNode], res: List[List[Int]]): List[List[Int]] =
      if (curLevel.isEmpty)
        res
      else {
        val nextLevel = curLevel.foldRight(List.empty[TreeNode])((node, ls) => {
          if (node.left != null && node.right != null)
            node.left :: node.right :: ls
          else if (node.left != null)
            node.left :: ls
          else if (node.right != null)
            node.right :: ls
          else
            ls
        })
        levelOrderBottom(nextLevel, curLevel.map(_.value) :: res)
      }

    if (root != null)
      levelOrderBottom(List(root), List())
    else
      Nil
  }
}
