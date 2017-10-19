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
}

object ListNode {
  def apply(num: Int*): ListNode = {
    if (num.isEmpty) null else {
      num.map(new ListNode(_)).reduceRight((node, res) => {
        node.next = res
        node
      })
    }
  }
}