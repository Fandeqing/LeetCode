/**
  * Created by wqlin on 17-10-19 11:29.
  * Definition for a binary tree node.
  */
class TreeNode(private var _value: Int) {

  def this(_value: Int, left: TreeNode, right: TreeNode) = {
    this(_value)
    this.left = left
    this.right = right
  }

  var value: Int = _value
  var left: TreeNode = _
  var right: TreeNode = _
}

object TreeNode {
  def apply(values: Any*): TreeNode = {
    val len = values.length
    val nodes = values.map {
      case v: Int => new TreeNode(v)
      case _ => null
    }
    nodes.zipWithIndex.foreach { case (node, index) =>
      if (index * 2 + 1 < len && node != null) node.left = nodes(index * 2 + 1)
      if (index * 2 + 2 < len && node != null) node.right = nodes(index * 2 + 2)
    }
    if (nodes.nonEmpty)
      nodes.head
    else
      null
  }
}
