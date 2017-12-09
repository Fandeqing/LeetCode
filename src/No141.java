/**
 * Created by wqlin on 17-12-9 23:24.
 */
public class No141 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;
    }
}
