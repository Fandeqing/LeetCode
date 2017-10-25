/**
  * Created by wqlin on 17-10-18 12:37.
  * Definition for singly-linked list.
  */
class ListNode(var _x: Int = 0) {
  def this(_x: Int, next: ListNode) = {
    this(_x)
    this.next = next
  }

  var next: ListNode = _
  var x: Int = _x

  override def toString: String = {
    val sb = new StringBuilder
    sb ++= x.toString
    var p = this.next
    while (p != null) {
      sb ++= "->" + p.x.toString
      p = p.next
    }
    sb.toString()
  }
}

object ListNode {
  def apply(nums: Int*): ListNode = {
    if (nums.isEmpty) null else {
      nums.map(new ListNode(_)).reduceRight((node, res) => {
        node.next = res
        node
      })
    }
  }
}