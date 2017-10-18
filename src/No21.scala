/**
  * Created by wqlin on 17-10-18 11:33.
  */

object No21 {
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    val sentinel = new ListNode(0)
    var p = sentinel
    var lr1 = l1
    var lr2 = l2
    while (lr1 != null && lr2 != null) {
      if (lr1._x < lr2._x) {
        p.next = lr1
        lr1 = lr1.next
      } else {
        p.next = lr2
        lr2 = lr2.next
      }
      p = p.next
    }
    if (lr1 != null)
      p.next = lr1
    if (lr2 != null)
      p.next = lr2
    sentinel.next
  }
}
