/**
  * Created by wqlin on 17-10-29 09:46.
  */
object No206 {
  // tail recursion solution
  def reverseList(head: ListNode): ListNode = {
    @annotation.tailrec
    def reverseList(head: ListNode, reverse: ListNode): ListNode = {
      if (head == null) reverse
      else {
        val tail = head.next
        head.next = reverse
        reverseList(tail, head)
      }
    }

    reverseList(head, null)
  }

  //another recursive solution is as follows:
  //  def reverseList(head: ListNode): ListNode = {
  //    if (head == null || head.next == null) head
  //    else {
  //      val tail = head.next
  //      head.next = null
  //      val res = reverseList(tail)
  //      tail.next = head
  //      res
  //    }
  //  }
}
