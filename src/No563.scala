/**
  * Created by wqlin on 18-2-9 22:20.
  */
object No563 {
  def findTilt(root: TreeNode): Int = {
    def loop(root: TreeNode): (Int, Int) = if (root == null) (0, 0) else {
      val (leftTreeSum, leftTreeTiltSum) = loop(root.left)
      val (rightTreeSum, rightTreeTiltSum) = loop(root.right)
      (leftTreeSum + rightTreeSum + root.value, leftTreeTiltSum + rightTreeTiltSum + (leftTreeSum - rightTreeSum).abs)
    }

    loop(root)._2
  }
}
