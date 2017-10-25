/**
  * Created by wqlin on 17-10-25 10:53.
  */

object No23 {
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    val q = collection.mutable.PriorityQueue.empty[ListNode](Ordering.by[ListNode, Int](_.x).reverse)
    lists.foreach(list => if (list != null) q += list)
    val res = new ListNode(-1)
    var p = res
    while (q.nonEmpty) {
      val head = q.dequeue()
      p.next = head
      p = p.next
      if (head.next != null)
        q += head.next
      head.next = null
    }
    res.next
  }
}
