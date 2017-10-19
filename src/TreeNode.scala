/**
  * Created by wqlin on 17-10-19 11:29.
  * Definition for a binary tree node.
  */
class TreeNode(var _value: Int) {

  def this(_value: Int, left: TreeNode, right: TreeNode) = {
    this(_value)
    this.left = left
    this.right = right
  }

  var value: Int = _value
  var left: TreeNode = _
  var right: TreeNode = _
}
