/**
  * Created by wqlin on 17-11-23 17:47.
  */
object No83 {
  def deleteDuplicates(head: ListNode): ListNode = {
    def delete(head: ListNode): ListNode =
      if (head == null || head.next == null) head
      else if (head.x == head.next.x) {
        head.next = head.next.next
        delete(head)
      } else delete(head.next)

    delete(head)
    head
  }
}
